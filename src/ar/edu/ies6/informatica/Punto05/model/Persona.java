package ar.edu.ies6.informatica.Punto05.model;

import java.time.LocalDate;
import java.time.Period;
	
public class Persona {

		    // Atributos privados
		    private String dni;
		    private String nombre;
		    private LocalDate fechaNacimiento;
		    private String provincia;

		    // Constructores
		    public Persona() {
		        this.dni = "Desconocido";
		        this.nombre = "Desconocido";
		        this.fechaNacimiento = LocalDate.now();
		        this.provincia = "Desconocido";
		    }
		    public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		        this.dni = dni;
		        this.nombre = nombre;
		        this.fechaNacimiento = fechaNacimiento;
		        this.provincia = provincia;
		    }

		    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		        this.dni = dni;
		        this.nombre = nombre;
		        this.fechaNacimiento = fechaNacimiento;
		        this.provincia = "Jujuy";
		    }

		    // Métodos accesores (getters y setters)
		    public String getDni() {
		        return dni;
		    }

		    public void setDni(String dni) {
		        this.dni = dni;
		    }

		    public String getNombre() {
		        return nombre;
		    }

		    public void setNombre(String nombre) {
		        this.nombre = nombre;
		    }

		    public LocalDate getFechaNacimiento() {
		        return fechaNacimiento;
		    }

		    public void setFechaNacimiento(LocalDate fechaNacimiento) {
		        this.fechaNacimiento = fechaNacimiento;
		    }

		    public String getProvincia() {
		        return provincia;
		    }

		    public void setProvincia(String provincia) {
		        this.provincia = provincia;
		    }

		    // Método para calcular la edad
		    public int calcularEdad() {
		        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
		    }

		    // Método para verificar si es mayor de edad
		    public boolean esMayorDeEdad() {
		        return calcularEdad() >= 18;
		    }

		    // Método para mostrar los datos
		    public void mostrarDatos() {
		        System.out.println("DNI: " + this.dni);
		        System.out.println("Nombre: " + this.nombre);
		        System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
		        System.out.println("Provincia: " + this.provincia);
		        System.out.println("Edad: " + calcularEdad());
		        if (esMayorDeEdad()) {
		            System.out.println("La persona es mayor de edad.");
		        } else {
		            System.out.println("La persona no es mayor de edad.");
		        }
		    }
		}
