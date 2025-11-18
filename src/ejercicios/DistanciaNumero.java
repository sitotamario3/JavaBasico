package Ejercicios;

import java.util.Scanner;

public class DistanciaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Dame dos valores para ver la distancia entre ellos");
		a = scan.nextDouble();
		b = scan.nextDouble();
		
		c = Math.abs(a - b);
		
		System.out.printf("La distancia entre %.2f y %.2f es %.2f\n", a, b, c);
		
		scan.close();
	}

}
