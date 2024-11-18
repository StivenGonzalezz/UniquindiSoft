package src;

import src.entidades.comparadores.ComparadorSolicitante;
import src.ordenamiento.Ordenamiento;

public class Main {
    public static void main(String[] args) {
        ComparadorSolicitante comparadorSolicitante = new ComparadorSolicitante();
        comparadorSolicitante.revision();
        Ordenamiento ordenamiento = new Ordenamiento();
        ordenamiento.ordenamiento();
    }
}