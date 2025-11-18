package Ejercicios;

import java.util.Scanner;

public class NotaFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double a, b, c, parciales, examen, trabajo, notaF;
		
		
		System.out.println("Dame las notas de las calificaciones parciales, el examen final y el trabajo final para obtener la nota final de Algoritmos: ");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		parciales = a * 0.55;
		examen = b * 0.3;
		trabajo = c * 0.15;
		
		notaF = parciales + examen + trabajo;
		
		System.out.printf("La nota media de Algoritmos es de: %.2f\n", notaF);
		
		
		
		
		
		
		
		
		scan.close();
	}

}
