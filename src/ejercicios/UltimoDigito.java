package ejercicios;

import java.util.Scanner;

public class UltimoDigito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Dame un numero entero de varias cifras: ");
		a = scan.nextInt();
		
		b = a % 10;
		
		System.out.printf("La última cifra de %d es %d\n", a, b);
		
		scan.close();
	}

}
