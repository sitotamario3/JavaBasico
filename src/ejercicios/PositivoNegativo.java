package Ejercicios;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double num;
		
		System.out.println("Introduce un número: ");
		num = scan.nextDouble();
		
		if (num == 0) {
			System.out.println("El número elegido es 0");
		} else if (num < 0) {
			System.out.println("El número elegido " + num + " es un número negativo");
		} else {
			System.out.println("El número elegido " + num + " es un número positivo");
		}
		
		
		
		scan.close();
	}

}
