package ejercicios;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double radio, area, pi;
		
		
		System.out.println("Dame la longitud del radio para calcular el área de un círculo: ");
		radio = scan.nextDouble();
		pi = Math.PI;
		area = radio * pi; 
		
		
		System.out.println("El área del círculo es " + area);
		
		
		
		scan.close();
		
	}

}
