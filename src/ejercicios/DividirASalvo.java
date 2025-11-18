package Ejercicios;

import java.util.Scanner;

public class DividirASalvo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double num1, num2, resultado;
		
		System.out.println("Introduce una cifra: ");
		num1 = scan.nextDouble();
		
		System.out.println("Introduce otra cifra que la divida: ");
		num2 = scan.nextDouble();
		
		resultado = num1 / num2;
		
		if (num2 == 0) {
			System.out.println("Error: No se puede dividir por cero");
		} else {
			System.out.printf("El resultado de la división es: %.2f\n", resultado);
		}
			
		
		
		
		
		scan.close();
	}

}
