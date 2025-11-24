package ejercicios;

import java.util.Scanner;

public class PuntoEncuentro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double x, y, media;
		
		System.out.print("Introudce en el que está el primer coche :");
		x = sc.nextDouble();
		
		System.out.print("Introudce en el que está el segundo coche :");
		y = sc.nextDouble();
		
		media = (x + y) / 2;
		
		System.out.println("El kilómetro en el que se deberán encontrar ambos coches es en el: " + media);
		
		
		sc.close();
	}

}
