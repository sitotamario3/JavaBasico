package ejercicios;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N, multi;
		multi = 1;
		
		System.out.println("Introduce un número");
		N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			multi *= i;
		}
		
		System.out.println(multi);
		
		sc.close();
	}

}
