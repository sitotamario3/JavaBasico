package ejercicios;

import java.util.Scanner;

public class FindeV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int dia;
		
		System.out.println("Introduce el dia de la semana en formato numérico: ");
		
		dia = sc.nextInt();
		
		switch (dia) {
			case 1:
				System.out.println("El día seleccionado es dia laboral");
				break;
			case 2:
				System.out.println("El día seleccionado es dia laboral");
				break;
			case 3:
				System.out.println("El día seleccionado es dia laboral");
				break;
			case 4:
				System.out.println("El día seleccionado es dia laboral");
				break;
			case 5:
				System.out.println("El día seleccionado es dia laboral");
				break;
			case 6:
				System.out.println("El día seleccionado es fin de semana");
				break;
			case 7:
				System.out.println("El día seleccionado es fin de semana");
				break;
			default:
				System.out.println("Opción no válida");
			
		}
			
		sc.close();
	}

}
