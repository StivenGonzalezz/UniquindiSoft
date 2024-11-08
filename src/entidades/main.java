package entidades;

import csv.ArchivosCSV;

public class main {
    public static void main(String[] args) {
        ArchivosCSV archivosCSV = new ArchivosCSV();
        archivosCSV.LeerCSVSolicitantes("datos");
        Condiciones condiciones = new Condiciones(archivosCSV); // Pasar la instancia de ArchivosCSV
        condiciones.revision();
    }
}
