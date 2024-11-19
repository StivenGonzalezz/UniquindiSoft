package src.cache;

import src.entidades.humanos.entes.Embargado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CargadorEmbargados {

    private Map<Long, Embargado> cacheEmbargados = new HashMap<>();

    public void cargarDesdeCSV(String rutaArchivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 9) {
                    String nombre = datos[0].trim();
                    String apellidos = datos[1].trim();
                    int edad = Integer.parseInt(datos[2].trim());
                    long documento = Long.parseLong(datos[3].trim());
                    long telefono = Long.parseLong(datos[4].trim());
                    String ciudadResidencia = datos[5].trim();
                    boolean isDeclarador = Boolean.parseBoolean(datos[6].trim());
                    boolean isEmbargado = Boolean.parseBoolean(datos[7].trim());
                    boolean isInhabilitado = Boolean.parseBoolean(datos[8].trim());

                    Embargado embargado = new Embargado(
                            nombre, apellidos, edad, documento, telefono, ciudadResidencia,
                            isDeclarador, isEmbargado, isInhabilitado
                    );
                    cacheEmbargados.put(documento, embargado);
                }
            }
        }
    }

    public Map<Long, Embargado> getCacheEmbargados() {
        return cacheEmbargados;
    }
}
