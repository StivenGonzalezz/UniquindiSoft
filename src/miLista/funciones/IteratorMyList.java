package miLista.funciones;

import java.util.Iterator;

//revisar como recorre con este iterator la lista
public class IteratorMyList<T> implements Iterator<T> {
    private Nodo<T> actual;

    public IteratorMyList(Nodo<T> inicial) {
        this.actual = inicial;
    }

    @Override
    public boolean hasNext() {

        return actual!=null;
    }

    @Override
    public T next() {
        if(hasNext()){
            T dato= actual.getDato();
            actual=actual.getSiguiente();
            return dato;
        }
        return null;
    }
}
