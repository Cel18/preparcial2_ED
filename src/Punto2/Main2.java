package Punto2;

import Utilidades.Cola;
import Utilidades.Pila;

public class Main2 {
    public static void main(String[] args) {
        ColaPrimos colaPrimos = new ColaPrimos();
        Pila<Integer> pila = new Pila<>();
        pila.insertar(1);
        pila.insertar(2);
        pila.insertar(3);
        pila.insertar(4);
        pila.insertar(5);
        pila.insertar(6);
        pila.insertar(7);

        Cola<Integer> res = (colaPrimos.seleccionarPrimos(pila));
        res.mostrarCola();
    }
}
