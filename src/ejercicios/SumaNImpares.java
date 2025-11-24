package ejercicios;

import java.util.Scanner;

public class SumaNImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N, suma;
		
		System.out.println("Introduce un número: ");
		
		N = sc.nextInt();
		suma = 0;
		
		for (int i = 1; i <=N; i++) {
			if (i % 2 != 0) {
			  suma += i;
			}
		}

		 System.out.println(suma);
		
		
		sc.close();
	}

}
