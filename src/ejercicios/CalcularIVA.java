package Ejercicios;

import java.util.Scanner;

public class CalcularIVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double PInicial, IVA, PFinal;
		
		System.out.println("Dame el precio del producto sin IVA para obtener el precio final: ");
		PInicial = scan.nextDouble();
		IVA = 0.21;
		PFinal = (PInicial * (1+IVA));
		
		
		System.out.println("El precio final del producto es: " + PFinal);
		
		scan.close();
	}

}
