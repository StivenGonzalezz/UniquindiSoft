package src.entidades.pruebaComparadores;

import src.csv.ArchivosCSV;
import src.entidades.comparadores.ComparadorSolicitante;

public class main {
    public static void main(String[] args) {
        ArchivosCSV archivosCSV = new ArchivosCSV();
        archivosCSV.LeerCSVSolicitantes("datos");
        ComparadorSolicitante comparadorSolicitante = new ComparadorSolicitante(archivosCSV);
        //Condiciones condiciones = new Condiciones(archivosCSV); // Pasar la instancia de ArchivosCSV
        //condiciones.revision();
        comparadorSolicitante.revision();
        //System.out.println("hola git");
    }
}
