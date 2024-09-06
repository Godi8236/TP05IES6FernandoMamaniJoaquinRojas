package ar.edu.ies6.informatica.Punto05;

import java.time.LocalDate;

import ar.edu.ies6.informatica.Punto05.model.Persona;

public class Main {
    public static void main(String[] args) {
        // Construir objeto utilizando el constructor por defecto
        Persona persona1 = new Persona();
        System.out.println("Persona creada con el constructor por defecto:");
        persona1.mostrarDatos();

        // Construir objeto utilizando el constructor parametrizado
        Persona persona2 = new Persona("12345678", "Juan Perez", LocalDate.of(1995, 5, 24), "Buenos Aires");
        System.out.println("\nPersona creada con el constructor parametrizado:");
        persona2.mostrarDatos();

        // Construir objeto utilizando el constructor con dni, nombre y fecha de nacimiento
        Persona persona3 = new Persona("87654321", "Ana Lopez", LocalDate.of(2005, 10, 15));
        System.out.println("\nPersona creada con el constructor que inicializa dni, nombre y fecha de nacimiento:");
        persona3.mostrarDatos();
    }
}
