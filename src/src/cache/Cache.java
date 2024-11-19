package src.cache;

import src.entidades.humanos.entes.Contraloria;
import src.entidades.humanos.entes.Fiscalia;
import src.entidades.humanos.entes.Procuraduria;

import java.io.IOException;
import java.text.ParseException;

public class Cache {

    public Cache() {

    }

    public void cacheSolicitantes(){
        CargadorSolicitantes cargador = new CargadorSolicitantes();
        try {
            cargador.cargarDesdeCSV("C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\solicitudesEntrantes\\solicitantes.csv");
            System.out.println("Solicitantes cargados:");
            cargador.getCacheSolicitantes().forEach((documento, solicitante) -> {
                System.out.println("Documento: " + documento + ", Nombre: " + solicitante.getNombre() +
                        ", Apellidos: " + solicitante.getApellidos() +
                        ", Edad: " + solicitante.getEdad() +
                        ", Declarador: " + solicitante.isDeclarador() +
                        ", Fecha: " + solicitante.getFecha());
            });
        } catch (IOException | ParseException e) {
            System.err.println("Error al cargar el archivo: " + e.getMessage());
        }
    }

    public void cacheEntes(){

        CargadorGenerico cargadorEntes = new CargadorGenerico();
        //cache entes
        try {
            // Cargar datos en caché para cada tipo
            cargadorEntes.cargarDesdeCSV("C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\contraloria.csv", Contraloria.class);
            cargadorEntes.cargarDesdeCSV("C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\fiscalia.csv", Fiscalia.class);
            cargadorEntes.cargarDesdeCSV("C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\procuraduria.csv", Procuraduria.class);

            // Verificar caché Contraloria
            System.out.println("Contraloria:");
            cargadorEntes.getCacheContraloria().forEach((documento, obj) -> {
                Contraloria contraloria = (Contraloria) obj;
                System.out.println("Documento: " + contraloria.getDocumento() + ", Nombre: " + contraloria.getNombre() +
                        ", Inhabilitado: " + contraloria.isInhabilitado());
            });

            // Verificar caché Fiscalía
            System.out.println("Fiscalia:");
            cargadorEntes.getCacheFiscalia().forEach((documento, obj) -> {
                Fiscalia fiscalia = (Fiscalia) obj;
                System.out.println("Documento: " + fiscalia.getDocumento() + ", Nombre: " + fiscalia.getNombre() +
                        ", Embargado: " + fiscalia.isEmbargado());
            });

            // Verificar caché Procuraduría
            System.out.println("Procuraduria:");
            cargadorEntes.getCacheProcuraduria().forEach((documento, obj) -> {
                Procuraduria procuraduria = (Procuraduria) obj;
                System.out.println("Documento: " + procuraduria.getDocumento() + ", Nombre: " + procuraduria.getNombre() +
                        ", Declarador: " + procuraduria.isDeclarador());
            });

        } catch (IOException e) {
            System.err.println("Error al leer los archivos CSV: " + e.getMessage());
        }
    }

    public void cacheEmbargados(){

        CargadorEmbargados cargador = new CargadorEmbargados();

        try {
            // Ruta del archivo CSV
            String ruta = "C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\embargados.csv";
            cargador.cargarDesdeCSV(ruta);

            // Mostrar los datos cargados
            cargador.getCacheEmbargados().forEach((documento, embargado) -> {
                System.out.println("Documento: " + documento + ", Nombre: " + embargado.getNombre() +
                        ", Embargado: " + embargado.isEmbargado());
            });

        } catch (IOException e) {
            System.err.println("Error al leer el archivo CSV: " + e.getMessage());
        }
    }

    public void cacheInhabilitados(){
        CargadorInhabilitados cargador = new CargadorInhabilitados();

        try {
            // Ruta del archivo CSV
            String ruta = "C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\inhabilitados.csv";
            cargador.cargarDesdeCSV(ruta);

            // Mostrar los datos cargados
            cargador.getCacheInhabilitados().forEach((documento, inhabilitado) -> {
                System.out.println("Documento: " + documento + ", Nombre: " + inhabilitado.getNombre() +
                        ", Fecha de Inhabilitación: " + inhabilitado.getFechaInhabilitacion());
            });

        } catch (IOException e) {
            System.err.println("Error al leer el archivo CSV: " + e.getMessage());
        }
    }

}
