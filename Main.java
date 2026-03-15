class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

class Estudiante extends Persona {
    String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    public void mostrarCarrera() {
        System.out.println("Carrera: " + carrera);
    }
}

public class Main {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Jose", 20, "Ingenieria en Sistemas");

        estudiante1.mostrarInformacion();
        estudiante1.mostrarCarrera();

    }

}