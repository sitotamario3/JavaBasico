package ejercicios;

import java.util.Scanner;

public class ValidarNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double nota;
		
		System.out.println("Introduce la nota del examen");
		nota = sc.nextDouble();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Por favor introduce una nota del 0 al 10");
			nota = sc.nextDouble();
		}
		
		
		
		sc.close();
	}

}
