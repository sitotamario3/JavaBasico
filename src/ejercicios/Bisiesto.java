package Ejercicios;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		int num1, resultado;
		
		System.out.println("Inserta un año");
		num1 = scan.nextInt();
		
		if ( num1 % 4 == 0 && num1 % 100 != 0 && num1) {
			System.out.println("Es bisiesto");
		} 
		
		
		
		
		
		
		
		scan.close();
	}

}
