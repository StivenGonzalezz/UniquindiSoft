package miLista.funciones;

public class Nodo <T>{
    private Nodo<T> siguiente;
    private Nodo<T> atras;
    private T dato;

    public Nodo(T dato){
        this.dato=dato;
        this.siguiente=null;
        this.atras=null;
    }

    public T getDato() {
        return dato;
    }public void setDato(T dato) {
        this.dato = dato;
    }public Nodo<T> getSiguiente() {
        return siguiente;
    }public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }public Nodo<T> getAtras() {
        return atras;
    }public void setAtras(Nodo<T> atras) {
        this.atras = atras;
    }
}

