package ar.edu.ies6.informatica.Punto04;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ingreso de datos por consola
				Scanner scanner = new Scanner(System.in);
					System.out.println("Ingrese un numero entero comprendido entre 1 - 9");
					//Recibe el numero ingresado
					if (scanner.hasNextInt()) {
						int num = scanner.nextInt();
			            System.out.println("Tabla de multiplicar del " + num + ":");
			            //Realiza la tabla de multiplicar
						for (int i = 1 ; i <= 10 ; i++) {
							int multi = num * i;
							System.out.println("La tabla del numero ingresado es: "+multi);
						}
						//Cierra el Scanner
						scanner.close();
					}
	}

}
