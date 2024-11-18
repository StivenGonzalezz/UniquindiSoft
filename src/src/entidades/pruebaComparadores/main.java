package src.entidades.pruebaComparadores;

import src.csv.ArchivosCSV;
import src.entidades.comparadores.ComparadorSolicitante;
import src.ordenamiento.Ordenamiento;

public class main {
    public static void main(String[] args) {
        // CREAMOS LA CLASE QUE CONTENDRA LAS FUNCIONES DE LECTUA DE LOS CSV
        ArchivosCSV archivosCSV = new ArchivosCSV();
        // LEEMOS LOS ARCHIVOS DE LOS SOLICITANTES
        archivosCSV.LeerCSVSolicitantes();

        // CREAMOS LA CLASE QUE CONTENDRA LOS VALIDADORES DE DONDE DEBE DE IR CADA POSTULANTE
        ComparadorSolicitante comparadorSolicitante = new ComparadorSolicitante(archivosCSV);
        comparadorSolicitante.revision();


        // CREAMOS LA CLASE QUE SE ENCARGA DE ORDENAS LOS POSTULANTES SEGUN LAS PRIORIDADES DADAS
        Ordenamiento ordenamiento = new Ordenamiento();
        ordenamiento.ordenamiento();
    }
}
