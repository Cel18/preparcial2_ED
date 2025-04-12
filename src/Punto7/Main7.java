package Punto7;

import java.util.LinkedList;

public class Main7 {
    public static void main(String[] args) {
        InsertarValor clase = new InsertarValor();
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(-6);

        clase.insertarValor2(lista);

        for (int valor : lista){
            System.out.print(valor + ", ");
        }
    }
}
