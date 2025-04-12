package Utilidades;

public class Pila<T> {
    private Nodo<T> cima;
    private int tamanio;

    public Pila() {
        this.cima = null;
        this.tamanio = 0;
    }

    public boolean isVacia(){
        return cima == null;
    }

    public void insertar(T valor){
        Nodo<T> nuevoNodo = new Nodo<T>(valor);
        if (isVacia()) {
            cima = nuevoNodo;
        }else{
            nuevoNodo.setSiguiente(cima);
            cima = nuevoNodo;
        }
        tamanio ++;
    }

    public void eliminar(){
        if (!isVacia()) {
            cima = cima.getSiguiente();
            tamanio --;
        }
    }

    public  void mostrarPila(){
        Nodo<T> actual = cima;
        System.out.print("[");
        while (actual != null) {
            System.out.print(actual.getValor());
            if (actual.getSiguiente() != null) {
                System.out.print(", ");
            }
            actual = actual.getSiguiente();
        }
        System.out.print("]");
    }

    //getters and setters
    public Nodo<T> getCima() {
        return cima;
    }

    public void setCima(Nodo<T> cima) {
        this.cima = cima;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
