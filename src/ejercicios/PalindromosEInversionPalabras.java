package ejercicios;

import java.util.Scanner;

public class PalindromosEInversionPalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int dia;
		
		System.out.println("Que día es?: ");
		dia = sc.nextInt();
		
		switch (dia) {
		case 1, 2, 3, 4, 5 -> System.out.println("Es dia entre semana");
		case 6, 7 -> System.out.println("Es fin de semana");
		default -> System.out.println("Por favor selecciona un dia del 1 al 7");
		}
		
		sc.close();
	}

}
