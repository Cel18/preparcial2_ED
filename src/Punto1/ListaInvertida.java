package Punto1;

import Utilidades.Pila;
import java.util.LinkedList;

public class ListaInvertida {

    public <T> LinkedList<T> invertir (LinkedList<T> lista) {
        LinkedList<T> listaInvertida = new LinkedList<>();
        Pila<T> pila = new Pila<>();
        for (T valor : lista) {
            pila.insertar(valor);
        }
        while (!pila.isVacia()){
            listaInvertida.addLast(pila.getCima().getValor());
            pila.eliminar();
        }
        return listaInvertida;
    }
}
