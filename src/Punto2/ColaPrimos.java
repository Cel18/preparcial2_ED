package Punto2;

import Utilidades.Cola;
import Utilidades.Pila;

public class ColaPrimos {
    public Cola<Integer> seleccionarPrimos(Pila<Integer> pila) {
        Cola<Integer> cola = new Cola<>();

        while (!pila.isVacia()){
            int valor = pila.getCima().getValor();
            if (esPrimo(valor)){
                cola.encolar(valor);
            }
            pila.eliminar();
        }
        return cola;
    }
    
    public boolean esPrimo(int valor){
        if (valor < 2){
            return false;
        }
        for (int i = 2; i * i <= valor ; i++) {
            if (valor%i == 0) {
                return false;
            }
        }
        return true;
    }
}
