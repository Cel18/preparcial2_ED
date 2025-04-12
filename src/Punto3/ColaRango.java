package Punto3;

public class ColaRango<T extends Persona> {

    public Cola<T> eliminarHombresRango(Cola<T> original) {
        if (original.isVacia()) {
            return original;
        }

        Cola<T> conservar = new Cola<>();

        while (!original.isVacia()) {
            T persona = original.inicial.getDato();
            original.desencolar();

            if (!(persona.getSexo() == Sexo.MASCULINO && persona.getEdad() >= 30 && persona.getEdad() <= 50)) {
                conservar.encolar(persona);
            }
        }
        return conservar;
    }
}