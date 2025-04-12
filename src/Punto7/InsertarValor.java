package Punto7;

import Utilidades.Nodo;

import java.util.LinkedList;

public class InsertarValor {

    public LinkedList<Integer> insertarValor2(LinkedList<Integer> lista){
        int suma = sumar(lista, 0);
        insertar2(lista, 0, suma);
        return lista;
    }

    private void insertar2(LinkedList<Integer> lista, int indice, int suma){
        if (indice >= lista.size()){
            return;
        }

        int elemento = lista.get(indice);
        if (elemento == suma){
            lista.add(indice +1, 2);
            insertar2(lista, indice + 2, suma);
        }else{
        insertar2(lista, indice + 1, suma);
        }
    }

    public int sumar(LinkedList<Integer> lista, int indice){
        int res = 0;
        if (indice >= lista.size()){
            return res;
        }
        res = lista.get(indice) + sumar(lista, indice +1);
        return res;
    }
}
