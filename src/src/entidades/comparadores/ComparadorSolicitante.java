package src.entidades.comparadores;

import src.csv.ArchivosCSV;
import src.entidades.humanos.Solicitantes;
import src.entidades.humanos.entes.Contraloria;
import src.entidades.humanos.entes.Fiscalia;
import src.entidades.humanos.entes.Procuraduria;
import java.util.ArrayList;

public class ComparadorSolicitante {

    private ArchivosCSV archivosCSV;
    private ArrayList<Solicitantes> listaSolicitantes;
    private ArrayList<Contraloria> listaContraloria;
    private ArrayList<Fiscalia> listaFiscalia;
    private ArrayList<Procuraduria> listaProcuraduria;

    public ComparadorSolicitante(ArchivosCSV archivosCSV) {
        this.archivosCSV = archivosCSV;
        this.listaSolicitantes = archivosCSV.getListaSolicitantes(); // Obtener la lista de ArchivosCSV
        this.listaContraloria = archivosCSV.getListaContraloria();
        this.listaFiscalia = archivosCSV.getListaFiscalia();
        this.listaProcuraduria = archivosCSV.getListaProcuraduria();
    }


    public void revision() {
        archivosCSV.LeerCSVProcuraduria();
        archivosCSV.LeerCSVSolicitantes("datos");
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
        /*for (Procuraduria p : listaProcuraduria){
            System.out.println(p.getNombre());
        }*/
        System.out.println(listaProcuraduria.size());


        for (int i = 0; i < listaProcuraduria.size(); i++) {
            for (int j = 0; j < listaSolicitantes.size(); j++) {
                if (listaProcuraduria.get(i).getDocumento() == listaSolicitantes.get(j).getDocumento()) {
                    if (listaProcuraduria.get(i).isEmbargado()) {
                        archivosCSV.embargadosEscribirCSVProcuraduria(i);
                    } else if (listaProcuraduria.get(i).isInhabilitado()) {
                        archivosCSV.inhabilitadosEscribirCSVProcuraduria(j);
                    } else {

                    }
                }
            }
        }
    }
}
