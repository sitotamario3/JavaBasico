package Ejercicios;

import java.util.Scanner;

public class Catetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double lado1, lado2, hipotenusaCuadrado, hipotenusa;
		
		System.out.println("Dame el lado del primer cateto del triángulo rectángulo en cm para calcular su hipotenusa: ");
		lado1 = scan.nextDouble();
		
		System.out.println("Dame el lado del segundo cateto del triángulo rectángulo en cm para calcular su hipotenusa: ");
		lado2 = scan.nextDouble();
		
		hipotenusaCuadrado = (Math.pow(lado1, 2) + Math.pow(lado2, 2));
		
		hipotenusa = Math.sqrt(hipotenusaCuadrado);
		
		System.out.printf("La dimensión de la hipotenusa es de: %.2f cm\n", hipotenusa);
		
		
		scan.close();
	}

}
