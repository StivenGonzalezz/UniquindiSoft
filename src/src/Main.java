package src;

import src.cache.Cache;
import src.entidades.comparadores.ComparadorSolicitante;
import src.ordenamiento.Ordenamiento;
import src.ordenamiento.OrganizadorArchivos;

public class Main {
    public static void main(String[] args) {

        Cache cache =new Cache();
        Ordenamiento ordenamiento = new Ordenamiento();
        ComparadorSolicitante comparadorSolicitante = new ComparadorSolicitante();

        comparadorSolicitante.revision();
        ordenamiento.ordenamiento();
        //cache.cacheSolicitantes();
        //cache.cacheEntes();
        //cache.cacheEmbargados();
        //cache.cacheInhabilitados();
        OrganizadorArchivos organizadorArchivos = new OrganizadorArchivos();
        organizadorArchivos.moverProcesados();

    }
}