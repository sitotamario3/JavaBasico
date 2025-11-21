package ejercicios;

import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int edad;
		
		System.out.println("Introduce tu edad: ");
		
		edad = sc.nextInt();
		
		if (edad < 13) {
			System.out.println("Eres un niño");
		} else if (edad >= 13 && edad <= 17) {
			System.out.println("Eres un adolescente");
		} else if (edad >= 18 && edad <= 64) {
			System.out.println("Eres un adulto");
		} else  {
			System.out.println("Eres un jubilado");
		}
		
		sc.close();
	}

}
