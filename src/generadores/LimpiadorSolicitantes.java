package generadores;

import java.io.FileWriter;
import java.io.IOException;
public class LimpiadorSolicitantes {
    public static void main(String[] args) {
        String rutaArchivo = "C:\\UQ\\estructuraDatos\\UniquindiSoft\\archivosCSV\\solicitudesEntrantes\\solicitantes.csv";
        try (FileWriter writer = new FileWriter(rutaArchivo, false)) {
            System.out.println("El archivo se ha limpiado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al limpiar el archivo: " + e.getMessage());
        }
    }
}