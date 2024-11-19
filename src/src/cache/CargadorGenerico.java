package src.cache;

import src.entidades.humanos.entes.Contraloria;
import src.entidades.humanos.entes.Fiscalia;
import src.entidades.humanos.entes.Procuraduria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CargadorGenerico {
    private Map<Long, Object> cacheContraloria = new HashMap<>();
    private Map<Long, Object> cacheFiscalia = new HashMap<>();
    private Map<Long, Object> cacheProcuraduria = new HashMap<>();

    public <T> void cargarDesdeCSV(String rutaArchivo, Class<T> clase) throws IOException {
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
                    String cuidadResidencia = datos[5].trim();
                    boolean isDeclarador = Boolean.parseBoolean(datos[6].trim());
                    boolean isEmbargado = Boolean.parseBoolean(datos[7].trim());
                    boolean isInhabilitado = Boolean.parseBoolean(datos[8].trim());

                    if (clase == Contraloria.class) {
                        Contraloria contraloria = new Contraloria(nombre, apellidos, edad, documento, telefono, cuidadResidencia, isDeclarador, isEmbargado, isInhabilitado);
                        cacheContraloria.put(documento, contraloria);
                    } else if (clase == Fiscalia.class) {
                        Fiscalia fiscalia = new Fiscalia(nombre, apellidos, edad, documento, telefono, cuidadResidencia, isDeclarador, isEmbargado, isInhabilitado);
                        cacheFiscalia.put(documento, fiscalia);
                    } else if (clase == Procuraduria.class) {
                        Procuraduria procuraduria = new Procuraduria(nombre, apellidos, edad, documento, telefono, cuidadResidencia, isDeclarador, isEmbargado, isInhabilitado);
                        cacheProcuraduria.put(documento, procuraduria);
                    }
                }
            }
        }
    }

    public Map<Long, Object> getCacheContraloria() {
        return cacheContraloria;
    }

    public Map<Long, Object> getCacheFiscalia() {
        return cacheFiscalia;
    }

    public Map<Long, Object> getCacheProcuraduria() {
        return cacheProcuraduria;
    }
}