package Punto3;

import Utilidades.Pila;

public class RepresentacionBin {

    public long representarEnBinario(int valor){
        Pila<Integer> pila = new Pila<>();
        long numBin = 0;

        if (valor < 0){
            System.out.print("número invalido ");
            return -1;
        }

        while(valor > 0){
            int res = valor % 2;
            pila.insertar(res);
            valor = valor/2;
        }

        while(!pila.isVacia()){
            numBin = (numBin * 10) + pila.getCima().getValor();
            //el 10 sirve para "extender" el número un cifra
            //y con la suma se decide si sigue un 1 o un 0
            pila.eliminar();
        }
        return numBin;
    }
}
