package Ejercicios;

import java.util.Scanner;

public class CalculadoraSimpleV2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Dame dos números:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
	
		
		System.out.println("La suma de " + num1 + " y " + num2 + " es " + (num1 + num2));
		
		System.out.println("La resta de " + num1 + " y " + num2 + " es " + (num1 - num2));
		
		System.out.println("La multiplicación de " + num1 + " y " + num2 + " es " + (num1 * num2));
		
		scan.close();

	}

}