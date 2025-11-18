package Ejercicios;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce un número entero: ");
		num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El número elegido es par");
		} else {
			System.out.println("El número elegido es impar");
		}
		
		
		scan.close();
	}

}
