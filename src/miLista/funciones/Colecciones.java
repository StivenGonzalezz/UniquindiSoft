package miLista.funciones;

public interface Colecciones <T> {
     void agregar(T elemento);
     void eliminar (T elemnto);
     Nodo<T> obtenerUltimo();
     void obtenerLista();

}
