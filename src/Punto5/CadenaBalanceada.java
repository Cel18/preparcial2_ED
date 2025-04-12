package Punto5;

import Utilidades.Pila;

public class CadenaBalanceada {

    public static boolean estaBalanceada(String cadena){
        Pila<Character> pila = new Pila<>();

        for(char caracter : cadena.toCharArray()){
            if(caracter == '(' || caracter == '{' || caracter == '['){
                pila.insertar(caracter);
            }
            else if(caracter == ')' || caracter == '}' || caracter == ']'){
                if(pila.isVacia()){
                    System.out.println("La cadena no está balanceada");
                    return false;
                }
                char cima = pila.getCima().getValor();
                pila.eliminar();
                if((caracter == ')' && cima != '(') || (caracter == '}' && cima != '{') || (caracter == ']' && cima != '[')){
                    System.out.println("La cadena no está balanceada");
                    return false;
                }
            }
        }
        if(pila.isVacia()){
            System.out.println("La cadena está balanceada");
            return true;
        }else{
            System.out.println("La cadena no está balanceada");
            return false;
        }
    }
}
