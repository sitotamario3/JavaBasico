package Ejercicios;

import java.util.Scanner;

public class MayorQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		System.out.println("Introduce dos números para compararlos: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else if (num1 == num2) {
			System.out.println("Son el mismo número");
		} else {
			System.out.println(num2 + " es mayor que " + num1);
		}
		
		
		
		scan.close();
	}

}
