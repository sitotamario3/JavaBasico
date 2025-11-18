package Ejercicios;

import java.util.Scanner;

public class Ordenar3Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.println("Inserta tres cifras: ");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();
		
		if (num1 > num2 && num2 > num3) {
			System.out.println("El órden de mayor a menor es: " + num1 + ", " + num2 + ", " + num3);
		} else if (num1 > num2 && num2 < 3) {
			System.out.println("El órden de mayor a menor es: " + num1 + ", " + num3 + ", " + num2);
		} else if (num1 < num2 && num1 > num3) {
			System.out.println("El órden de mayor a menor es: " + num2 + ", " + num1 + ", " + num3);
		} else if (num1 < num2 && num2 > num3) {
			System.out.println("El órden de mayor a menor es: " + num2 + ", " + num3 + ", " + num1);
		} else if (num3 > num2 && num2 > num1) {
			System.out.println("El órden de mayor a menor es: " + num3 + ", " + num2 + ", " + num1);
		} else  {
			System.out.println("El órden de mayor a menor es: " + num3 + ", " + num1 + ", " + num2);
		}
		
		
		
		scan.close();
	}

}
