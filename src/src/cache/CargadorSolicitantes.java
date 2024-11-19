package src.cache;

import src.entidades.humanos.Solicitantes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CargadorSolicitantes {
    private Map<Long, Solicitantes> cacheSolicitantes = new HashMap<>();

    public void cargarDesdeCSV(String rutaArchivo) throws IOException, ParseException {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 8) {
                    String nombre = datos[0].trim();
                    String apellidos = datos[1].trim();
                    int edad = Integer.parseInt(datos[2].trim());
                    long documento = Long.parseLong(datos[3].trim());
                    long telefono = Long.parseLong(datos[4].trim());
                    String cuidadResidencia = datos[5].trim();
                    boolean isDeclarador = Boolean.parseBoolean(datos[6].trim());
                    Date fecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(datos[7].trim());

                    Solicitantes solicitante = new Solicitantes(nombre, apellidos, edad, documento, telefono, cuidadResidencia, isDeclarador, fecha);
                    cacheSolicitantes.put(documento, solicitante);
                }
            }
        }
    }

    public Map<Long, Solicitantes> getCacheSolicitantes() {
        return cacheSolicitantes;
    }
}

