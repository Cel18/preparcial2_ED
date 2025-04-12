package Punto5;

public class Main5 {
    public static void main(String[] args) {
        CadenaBalanceada cadena = new CadenaBalanceada();
        cadena.estaBalanceada("(6-7)/4]");
        cadena.estaBalanceada("[(1+2)*4]+5");
    }
}
