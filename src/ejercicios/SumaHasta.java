package ejercicios;

import java.util.Scanner;

public class SumaHasta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1, suma;
		
		System.out.println("Hola, elige un número para sumarlo ");
		
		n1 = sc.nextInt();
		suma = 0;
		
		
		
		while (n1 != 0) {
			suma += n1;
			System.out.println("Elige otro número para sumarselo: ");
			n1 = sc.nextInt();
			
		}
		System.out.println("El resultado de la suma es: " + suma);
		
		
		
		sc.close();
	}

}
