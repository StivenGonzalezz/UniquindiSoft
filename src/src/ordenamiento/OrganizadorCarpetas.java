package src.ordenamiento;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class OrganizadorCarpetas {
    public void moverSolicitudes(){
        // Define las rutas de origen y destino
        Path origen = Paths.get("C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\solicitudesEntrantes\\solicitantes.csv");
        Path destino = Paths.get("C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\solicitudesProcesadas\\solicitantes.csv");

        try {
            // Mover el archivo
            Files.move(origen, destino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Archivos de solicitantes han sido movidos a solicitantes procesados");
        } catch (Exception e) {
            System.out.println("Error al mover el archivo: " + e.getMessage());
        }
    }
}
