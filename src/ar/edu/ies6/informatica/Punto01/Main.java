package ar.edu.ies6.informatica.Punto01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definicion de las varables
		
		String nombrePais = "Argentina";
		int edad = 25;
		double alturaEdificio = 180.5;
		double precio = 1050.50;
		//long numeroTelefono = 3884609238;
		double coseno = Math.cos(0.5);
		//Numeros para calcular el promedio
		int numero1 = 10;
		int numero2 = 6;
		int numero3 = 8;
		int numero4 = 7;
		int numero5 = 10;
		//Realiza la suma de todas las notas
		int sumaTotal = numero1+numero2+numero3+numero4+numero5;
		//Relaiza el calculo del promedio 
		int promedio = sumaTotal / 5;
		//Muestra el resultado por pantalla
		System.out.println("El promedio es: "+promedio);
	}

}
