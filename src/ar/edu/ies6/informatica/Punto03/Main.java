package ar.edu.ies6.informatica.Punto03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definicion de las variables
		
		//Ingreso de datos por consola
				Scanner scanner = new Scanner(System.in);
				//Cantidad a factorizar
					long factorial = 15;
					System.out.println("Ingrese un numero entero");
					//Lee el numero ingresado
					if (scanner.hasNextInt()) {
						int num = scanner.nextInt();
						if (num < 0 || num > 10) {
							System.out.println("Debe ingresar un numero del 0 al 10");
						}
						else {
							//Realiza la factorizacion
							while(num!=0) {
								factorial = factorial * num;
								num--;
							}
							//Muestra el numero factorizado
							System.out.println("El factorial es: "+factorial);
							scanner.close();
						}
					}
					else {
						System.out.println("Se ingresaron datos incorrectos");
					}
	}

}
