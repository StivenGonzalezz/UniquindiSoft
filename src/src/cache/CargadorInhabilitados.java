package src.cache;

import src.entidades.humanos.Inhabilitado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CargadorInhabilitados {

    private Map<Long, Inhabilitado> cacheInhabilitados = new HashMap<>();
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");

    public void cargarDesdeCSV(String rutaArchivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 10) {
                    String nombre = datos[0].trim();
                    String apellidos = datos[1].trim();
                    int edad = Integer.parseInt(datos[2].trim());
                    long documento = Long.parseLong(datos[3].trim());
                    long telefono = Long.parseLong(datos[4].trim());
                    String ciudadResidencia = datos[5].trim();
                    boolean isDeclarador = Boolean.parseBoolean(datos[6].trim());
                    boolean isEmbargado = Boolean.parseBoolean(datos[7].trim());
                    boolean isInhabilitado = Boolean.parseBoolean(datos[8].trim());
                    Date fechaInhabilitacion = parseFecha(datos[9].trim());

                    Inhabilitado inhabilitado = new Inhabilitado(
                            nombre, apellidos, edad, documento, telefono, ciudadResidencia,
                            isDeclarador, isEmbargado, isInhabilitado, fechaInhabilitacion
                    );
                    cacheInhabilitados.put(documento, inhabilitado);
                }
            }
        }
    }

    private Date parseFecha(String fechaStr) {
        try {
            return DATE_FORMAT.parse(fechaStr);
        } catch (ParseException e) {
            System.err.println("Error al parsear la fecha: " + fechaStr);
            return null;
        }
    }

    public Map<Long, Inhabilitado> getCacheInhabilitados() {
        return cacheInhabilitados;
    }
}
