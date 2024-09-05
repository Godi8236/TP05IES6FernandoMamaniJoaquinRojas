package ar.edu.ies6.informatica.Punto02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definicion de las variables
		
		//Ingreso de datos por consola
		Scanner scanner = new Scanner(System.in);
			System.out.println("Ingrese un numero entero");
			if (scanner.hasNextInt()) {
				int num = scanner.nextInt();
				if (num % 2 == 0) {
					System.out.println("El numero ingresado es par. " + 3*num);
				} else {
					System.out.println("El numero ingresado es impar. " + 2*num);
				}
			}
	}

}
