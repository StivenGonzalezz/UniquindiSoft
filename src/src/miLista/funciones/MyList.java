package miLista.funciones;

import java.util.Iterator;

public class MyList<T> implements Colecciones<T>, Iterable<T> {

    private Nodo<T> cabeza;
    private int tamano;

    public MyList(){
        this.cabeza=null;
        this.tamano=0;
    }

    @Override
    public void agregar(T elemento) {
        Nodo<T> n = new Nodo<>(elemento);
        if (this.cabeza == null) {
            this.cabeza = n;
        } else {
            Nodo<T> actual = this.cabeza;  // Usamos una variable temporal para recorrer
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(n);  // Añadimos el nuevo nodo al final de la lista
        }
    }


    @Override
    public void eliminar(T elemento) {
        if (this.cabeza == null) {
            // La lista está vacía
            return;
        }

        // Si el elemento a eliminar está en la cabeza
        if (this.cabeza.getDato().equals(elemento)) {
            this.cabeza = this.cabeza.getSiguiente(); // Mover la cabeza al siguiente nodo
            return;
        }

        Nodo<T> actual = this.cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getDato().equals(elemento)) {
                // Saltar el nodo que se va a eliminar
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return;
            }
            actual = actual.getSiguiente();
        }
    }

    @Override
    public Nodo<T> obtenerUltimo() {
        if (this.cabeza == null) {
            return null; // La lista está vacía
        }

        Nodo<T> actual = this.cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        System.out.println(actual.getDato());
        return actual; // Retornar el último nodo
    }


    @Override
    public void obtenerLista(){
        if (this.cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo<T> actual = this.cabeza;
        while (actual != null) {
            System.out.print(actual.getDato()+" ");
            actual = actual.getSiguiente();
        }
    }
    public void reversar(){
        Nodo<T> anterior= null;
        Nodo<T> actual = this.cabeza;
        Nodo<T>siguente =null;

        while(actual!=null){
            siguente= actual.getSiguiente();
            actual.setSiguiente(anterior);
            anterior=actual;
            actual=siguente;
        }
        cabeza = anterior;




    }

    public Nodo<T> getCabeza() {
        return cabeza;
    }public int getTamano() {
        return tamano;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorMyList<>(this.cabeza);
    }
}