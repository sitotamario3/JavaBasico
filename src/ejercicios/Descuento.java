package ejercicios;

import java.util.Scanner;

public class Descuento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double PInicial, descuento, PFinal;
		
		System.out.println("Dame el precio del producto para obtener su precio con el descuento del 15%: ");
		PInicial = scan.nextDouble();
		descuento = 0.15;
		PFinal = PInicial * (1-descuento);
		
		
		System.out.println("El precio final del producto es: " + PFinal);
		
		
		scan.close();
	}

}
