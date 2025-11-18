package Ejercicios;

import java.util.Scanner;

public class Raíces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double num, rCuadrada, rCubica;
		
		System.out.println("Introduce un número: ");		
		num = scan.nextDouble();
		rCuadrada = Math.sqrt(num);
		rCubica = Math.cbrt(num);
		
		System.out.println("Raíz cuadrada: " + rCuadrada + " y raíz cúbica: " + rCubica);
		
		
		scan.close();
	}

}
