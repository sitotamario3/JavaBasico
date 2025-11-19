package ejercicios;

import java.util.Scanner;

public class CocienteYResto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Dame dos numeros");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		
		System.out.println("El resultado de dividir " + num1 + " entre " + num2 + "es: " + (num1 / num2) + " y su resto es: " + (num1 % num2));
		
		
		
		
		
		scan.close();
	}

}
