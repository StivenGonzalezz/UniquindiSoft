package entidades;

import csv.ArchivosCSV;
import entidades.humanos.Cotizantes;
import entidades.humanos.Entes;

import java.util.ArrayList;

public class Condiciones {
    private ArchivosCSV archivosCSV;
    private ArrayList<Cotizantes> listaSolicitantes;
    private ArrayList<Entes> listaContraloria;
    private ArrayList<Entes> listaFiscalia;
    private ArrayList<Entes> listaProcuraduria;

    // Constructor para inicializar archivosCSV y listaCotizantes
    public Condiciones(ArchivosCSV archivosCSV) {
        this.archivosCSV = archivosCSV;
        this.listaSolicitantes = archivosCSV.getListaSolicitantes(); // Obtener la lista de ArchivosCSV
        this.listaContraloria = archivosCSV.getListaContraloria();
        this.listaFiscalia = archivosCSV.getListaFiscalia();

    }

    public void revision() {
        for (int i = 0; i < listaContraloria.size(); i++) {
            for (int j = 0; j < listaSolicitantes.size(); j++){
                if (listaContraloria.get(i).getDocumento()==listaSolicitantes.get(j).getDocumento()){
                    if(listaContraloria.get(i).isEmbargado()){
                        archivosCSV.embargadosEscribirCSVContraloria(i);
                    } else if (listaContraloria.get(i).isInhabilitado()) {
                        archivosCSV.inhabilitadosEscribirCSVContraloria(i);
                    }else{
                        //if (listaSolicitantes.get(j)){

                        }

                    }


                }
            }

        }

        //archivosCSV.imprimirLista();
}

