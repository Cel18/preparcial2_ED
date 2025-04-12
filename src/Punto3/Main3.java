package Punto3;

public class Main3 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Celeste",17,Sexo.FEMENINO);
        Persona persona2 = new Persona("Diego",45,Sexo.MASCULINO);
        Persona persona3 = new Persona("Cebolla Francesa",90,Sexo.MASCULINO);
        Persona persona4 = new Persona("Seb",40,Sexo.MASCULINO);
        Persona persona5 = new Persona("Angie",36,Sexo.FEMENINO);

        Cola<Persona> colaPersonas = new Cola<>();
        colaPersonas.encolar(persona1);
        colaPersonas.encolar(persona2);
        colaPersonas.encolar(persona3);
        colaPersonas.encolar(persona4);
        colaPersonas.encolar(persona5);

        colaPersonas.mostrarCola();

        System.out.println();

        ColaRango<Persona> colaRangoPersonas = new ColaRango<>();
        Cola<Persona> resultado = (colaRangoPersonas.eliminarHombresRango(colaPersonas));
        resultado.mostrarCola();
    }
}
