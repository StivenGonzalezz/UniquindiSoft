package src.ordenamiento;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class OrganizadorArchivos {

    public void moverProcesados(){
        Path origen = Paths.get("C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\solicitudesEntrantes\\solicitantes.csv");
        Path destino = Paths.get("C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\solicitudesProcesadas\\solicitantes.csv");

        try {
            Files.move(origen, destino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Solicitued proceadas movidas con exito");
        } catch (Exception e) {
            System.out.println("Error al mover el archivo: " + e.getMessage());
        }
    }

}
