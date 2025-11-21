package ejercicios;

import java.util.Scanner;

public class Finde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int dia;
		
		System.out.println("Introduce el dia de la semana en formato numérico: ");
		
		dia = sc.nextInt();
		
		if (dia == 6 || dia == 7) {
			System.out.println("El día seleccionado es fin de semana");
		} else {
			System.out.println("El día seleccionado es dia laboral");
		}
		
		sc.close();
	}

}
