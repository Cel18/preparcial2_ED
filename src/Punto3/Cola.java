package Punto3;

public class Cola <T extends  Persona>{
    protected Nodo<T> inicial;
    protected Nodo<T> fin;
    protected int tamanio;

    public Cola() {
        inicial = null;
        fin = null;
        tamanio = 0;
    }

    public boolean isVacia(){
        return inicial == null;
    }

    public void encolar(T valor){
        Nodo<T> newNodo = new Nodo(valor);

        if(isVacia()){
            inicial = newNodo;
            fin = newNodo;
        }else{
            fin.setSiguiente(newNodo);
            fin = newNodo;
        }
        tamanio++;
    }

    public void desencolar(){
        if(isVacia()){
            return;
        }else{
            inicial = inicial.getSiguiente();
            tamanio--;
        }

        if(!isVacia()){
            inicial = inicial.getSiguiente();
            tamanio--;
        }
    }

    public  void mostrarCola(){
        Nodo<T> actual = inicial;
        System.out.print("[");
        while (actual != null) {
            System.out.print(actual.getDato());
            if (actual.getSiguiente() != null) {
                System.out.print(", ");
            }
            actual = actual.getSiguiente();
        }
        System.out.print("]");
    }

}
