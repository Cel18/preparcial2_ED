package Utilidades;

public class Cola<T> {
    protected Nodo<T> inicial;
    protected Nodo<T> fin;
    protected int tamanio;

    public Cola() {
        this.inicial = null;
        this.fin = null;
        this.tamanio = 0;
    }

    //verificar si esta vacia
    public boolean isVacia(){
        return inicial == null;
    }

    //insertar un elemento al final
    public void encolar (T valor){
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        if (isVacia()) {
            inicial = nuevoNodo;
            fin = nuevoNodo;
        }else{
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
        tamanio ++;
    }

    //eliminar la cabeza de la cola
    public void desencolar (){
        if (!isVacia()) {
            inicial = inicial.getSiguiente();
            tamanio --;
        }
    }

    public  void mostrarCola(){
        Nodo<T> actual = inicial;
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
    public Nodo<T> getInicial() {
        return inicial;
    }

    public void setInicial(Nodo<T> inicial) {
        this.inicial = inicial;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public Nodo<T> getFin() {
        return fin;
    }

    public void setFin(Nodo<T> fin) {
        this.fin = fin;
    }
}
