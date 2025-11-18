package Ejercicios;

import java.util.Scanner;

public class USD_EUR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double dolares, tCambio, euros;
		
		System.out.println("Dame una cantidad de dinero en dólares para obtener su valor en euros: ");
		dolares = scan.nextDouble();
		tCambio = 0.92;
		euros = dolares * tCambio;
		
		
		System.out.printf("El valor en euros de la cantidad insertada en dólares es de: %.2f€\n", euros);
		
		
		scan.close();
	}

}
