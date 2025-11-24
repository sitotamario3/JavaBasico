package ejercicios;

import java.util.Scanner;

public class ClasificaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		System.out.println("***Programa de clasificación de triángulos***");
		System.out.println("Selecciona el tamaño de cada lado del triángulo: ");
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2) || Math.pow(B, 2) == Math.pow(A, 2) + Math.pow(C, 2) || Math.pow(C, 2) == Math.pow(B, 2) + Math.pow(A, 2)) {
			System.out.println("Es un Triángulo Rectángulo!");
		}  
		
		if (A == B && B == C) {
			System.out.println("Es un Triángulo Equilátero!");
		} else if (A == B || A == C || C == B) {
			System.out.println("Es un Triángulo Isósceles!");
		} else {
			System.out.println("Es un Triángulo Escaleno!");
		}
		
		sc.close();
	}

}
