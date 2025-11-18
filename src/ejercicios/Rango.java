package Ejercicios;

import java.util.Scanner;

public class Rango {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num1;
		
		System.out.println("Dame un número para comprobar si está en el rango 1-100");
		num1 = scan.nextInt();
		
		if (num1 >= 1 && num1  <= 100) {
			System.out.println("Está en el rango!");
		} else {
			System.out.println("No está en el rango...");
		}
		
		
		
		scan.close();
	}

}
