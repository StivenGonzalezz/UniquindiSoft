package src;

import src.entidades.comparadores.ComparadorSolicitante;
import src.ordenamiento.Ordenamiento;
import src.ordenamiento.OrganizadorCarpetas;

public class Main {
    public static void main(String[] args) {
        ComparadorSolicitante comparadorSolicitante = new ComparadorSolicitante();
        comparadorSolicitante.revision();
        Ordenamiento ordenamiento = new Ordenamiento();
        ordenamiento.ordenamiento();
        OrganizadorCarpetas organizadorCarpetas = new OrganizadorCarpetas();
        organizadorCarpetas.moverSolicitudes();
    }
}