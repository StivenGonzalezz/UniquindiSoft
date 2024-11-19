package src.ordenamiento;

import src.csv.ArchivosCSV;
import src.entidades.comparadores.ComparadorSolicitante;
import src.entidades.humanos.PreAprobado;
import src.entidades.humanos.entes.Contraloria;
import src.entidades.humanos.entes.Fiscalia;
import src.entidades.humanos.entes.Procuraduria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ordenamiento {


    public void ordenamiento() {
        ArchivosCSV archivosCSV = new ArchivosCSV();
        archivosCSV.leerCSVPreAprobados();
        ArrayList<PreAprobado> listaPreaprobados = archivosCSV.getListaPreAprobado();

        ordenarPrioridadAprobados(listaPreaprobados);

        ComparadorSolicitante comparadorSolicitante = new ComparadorSolicitante();
        comparadorSolicitante.revisionAprobados(listaPreaprobados);
    }

    //Ordenar personas
    public void ordenarPrioridadAprobados(ArrayList<PreAprobado> lista){
        lista.sort((f1, f2) -> {
            // Menores de 35 que no declaran renta
            if (f1.getEdad() < 35 && !f1.isDeclarador() && (f2.getEdad() >= 35 || f2.isDeclarador())) return -1;
            if (f2.getEdad() < 35 && !f2.isDeclarador() && (f1.getEdad() >= 35 || f1.isDeclarador())) return 1;

            // Menores de 35 que declaran renta
            if (f1.getEdad() < 35 && f1.isDeclarador() && (f2.getEdad() >= 35 || !f2.isDeclarador())) return -1;
            if (f2.getEdad() < 35 && f2.isDeclarador() && (f1.getEdad() >= 35 || !f1.isDeclarador())) return 1;

            //Mayores o iguales a 35 que declaran renta
            if (f1.getEdad() >= 35 && f1.isDeclarador() && (f2.getEdad() < 35 || !f2.isDeclarador())) return 1;
            if (f2.getEdad() >= 35 && f2.isDeclarador() && (f1.getEdad() < 35 || !f1.isDeclarador())) return -1;

            // Si son de la misma categoría organizar por nombre
            return f1.getNombre().compareTo(f2.getNombre());
        });
    }

    //  Metodo que recibe el array de personas de la fiscalia aprobadas y las ordena
    public void ordenarPrioridadFiscalia(ArrayList<Fiscalia> lista){
        Collections.sort(lista, new Comparator<Fiscalia>() {
            @Override
            public int compare(Fiscalia f1, Fiscalia f2) {
                // Prioridad 1: Personas menores de 35 años
                int result = Boolean.compare(f2.getEdad() < 35, f1.getEdad() < 35);
                if (result != 0) return result;

                // Prioridad 2: Personas que no están obligadas a declarar renta
                result = Boolean.compare(f1.isDeclarador(), f2.isDeclarador());
                if (result != 0) return result;

                // Prioridad 3: Orden original (puedes ajustarlo según lo necesites)
                // Ejemplo: Ordenar por nombre alfabéticamente
                return f1.getNombre().compareTo(f2.getNombre());
            }
        });
    }

}
