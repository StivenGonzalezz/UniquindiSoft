package miLista;

import miLista.funciones.MyList;

public class miListaEnlazada {
    public static void main(String[] args) {
        MyList<Integer> numeros = new MyList<>();
        numeros.agregar(2);
        numeros.agregar(3);
        numeros.agregar(5);
        numeros.obtenerUltimo();
        System.out.println();
        numeros.obtenerLista();
        numeros.reversar();

        //numeros.eliminar(3);
        System.out.println();
        numeros.obtenerLista();
    }
}