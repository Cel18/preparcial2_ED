package Punto1;

import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(5);
        lista.add(9);
        ListaInvertida clase = new ListaInvertida();
        System.out.println(clase.invertir(lista));
    }
}
