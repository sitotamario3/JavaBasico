package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Por favor, escribe un número por pantalla");
		int num = escaner.nextInt();
		
		escaner.close();
		
		if(num % 2 == 0) {
			System.out.print("El número: " + num + " es par");
		} else {
			System.out.print("El número: " + num + " es impar");
		}
	}

}
