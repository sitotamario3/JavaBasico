package ejercicios;

import java.util.Scanner;

public class ContarPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1, contador;
		
		System.out.println("Hola, introduce un valor");
		
		contador = 0;
		
		for (int i = 0; i < 5; i++) {
			n1 = sc.nextInt();
			if (n1 % 2 == 0) {
				contador++;
			}
			
		}
		
		System.out.println("Un total de " + contador + " numeros de los 5 son pares");
		
		sc.close();
	}

}
