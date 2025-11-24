package ejercicios;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double nota;
		
		System.out.println("Inserta la nota que has obtenido: ");
		
		nota = sc.nextDouble();
		
		if (nota <= 4) {
			System.out.println("Has obtenido un suspenso");
		} else if (nota <= 6) {
			System.out.println("Has obtenido un aprobado");
		} else if (nota <= 8) {
			System.out.println("Has sacado un notable");
		} else {
			System.out.println("Has sacado un sobresaliente");
		}
				
		sc.close();
	}

}
