package Ejercicios;

import java.util.Scanner;

public class Renta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int edad;
		double ingresos;
		
		System.out.println("Inserta tu edad: ");
		edad = scan.nextInt();
		
		System.out.println("Inserta tus ingresos: ");
		ingresos = scan.nextDouble();
		
		if (edad >= 18 && ingresos > 1000) {
			System.out.println("Tienes que tributar");
		} else {
			System.out.println("No tienes que tributar");
		}
				
		
		
		scan.close();
		
	}

}
