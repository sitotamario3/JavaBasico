package ejercicios;

import java.util.Scanner;

public class ConvertirUnidades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String unidad;
		double cifra, resultado;
		
		System.out.println("-Elige A para convertir metros a kilómetros.");
		System.out.println("");
		System.out.println("-Elige B para convertir kilómtros a metros.");
		unidad = sc.nextLine();
		
		
		if (unidad.equals("A")|| unidad.equals("a")) {
			System.out.println("Introduce el valor que quieres convertir: ");
			cifra = sc.nextDouble();
			resultado = cifra / 1000;
			System.out.println("Su valor en kilómetros es: " + resultado + " km");
		} else if (unidad.equals("B") || unidad.equals("b") ) {
			System.out.println("Introduce el valor que quieres convertir: ");
			cifra = sc.nextDouble();
			resultado = cifra * 1000;
			System.out.println("Su valor en metros es: " + resultado + " m");
		} 	else  {
			System.out.println("Por favor selecciona A o B");
		}
		
		sc.close();
	}

}
