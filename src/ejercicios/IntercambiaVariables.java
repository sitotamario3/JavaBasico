package ejercicios;

import java.util.Scanner;

public class IntercambiaVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Dame un valor para A: ");
		a = scan.nextInt();
		
		System.out.println("Dame un valor para B: ");
		b = scan.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.printf("El valor intercambiado para A es %d y el valor para B es %d: ", a, b);
		
		
		scan.close();
	}

}
