package src.entidades.pruebaComparadores;


import src.csv.ArchivosCSV;
import src.entidades.humanos.Solicitantes;
import src.entidades.humanos.entes.Contraloria;
import src.entidades.humanos.entes.Fiscalia;
import src.entidades.humanos.entes.Procuraduria;

import java.util.ArrayList;

public class Condiciones {

    private ArchivosCSV archivosCSV;
    private ArrayList<Solicitantes> listaSolicitantes;
    private ArrayList<Contraloria> listaContraloria;
    private ArrayList<Fiscalia> listaFiscalia;
    private ArrayList<Procuraduria> listaProcuraduria;

    // Constructor para inicializar archivosCSV y listaCotizantes
    public Condiciones(ArchivosCSV archivosCSV) {
        this.archivosCSV = archivosCSV;
        this.listaSolicitantes = archivosCSV.getListaSolicitantes(); // Obtener la lista de ArchivosCSV
        this.listaContraloria = archivosCSV.getListaContraloria();
        this.listaFiscalia = archivosCSV.getListaFiscalia();

    }

    public void revision() {
        for (int i = 0; i < listaContraloria.size(); i++) {
            for (int j = 0; j < listaSolicitantes.size(); j++) {
                if (listaContraloria.get(i).getDocumento() == listaSolicitantes.get(j).getDocumento()) {
                    if (listaContraloria.get(i).isEmbargado()) {
                        archivosCSV.embargadosEscribirCSVContraloria(i);
                    } else if (listaContraloria.get(i).isInhabilitado()) {
                        archivosCSV.inhabilitadosEscribirCSVContraloria(i);
                    } else {

                        //if (listaSolicitantes.get(j)){

                    }
                }
            }
        }

        for (int i = 0; i < listaFiscalia.size(); i++) {
            for (int j = 0; j < listaSolicitantes.size(); j++) {
                if (listaFiscalia.get(i).getDocumento() == listaSolicitantes.get(j).getDocumento()) {
                    if (listaFiscalia.get(i).isEmbargado()) {
                        archivosCSV.embargadosEscribirCSVFiscalia(i);
                    } else if (listaFiscalia.get(i).isInhabilitado()) {
                        archivosCSV.inhabilitadosEscribirCSVFiscalia(i);
                    } else {

                        //if (listaSolicitantes.get(j)){

                    }
                }
            }
        }

        for (int i = 0; i < listaProcuraduria.size(); i++) {
            for (int j = 0; j < listaSolicitantes.size(); j++) {
                if (listaProcuraduria.get(i).getDocumento() == listaSolicitantes.get(j).getDocumento()) {
                    if (listaProcuraduria.get(i).isEmbargado()) {
                        archivosCSV.embargadosEscribirCSVProcuraduria(i);
                    } else if (listaProcuraduria.get(i).isInhabilitado()) {
                        archivosCSV.inhabilitadosEscribirCSVProcuraduria(i);
                    } else {

                        //if (listaSolicitantes.get(j)){

                    }
                }
            }
        }
    }

        //archivosCSV.imprimirLista();
}

