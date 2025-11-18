package Ejercicios;

import java.util.Scanner;

public class calculoPotencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double num1, num2, resultado, x;
		
		System.out.println("Inserta una cifra para calcular la potencia: ");
		num1 = scan.nextDouble();
		
		System.out.println("Inserta la potencia deseada: ");
		num2 = scan.nextDouble();
		
		
		resultado = num1; 
		
		if (num2 > 0 ) {while (num2 > 1)  {
			resultado = resultado * num1;
			num2--;
			}
		} else if (num2 == 0) {
			resultado = 1;
		} else { 
			resultado = Math.pow(num1, num2);
		}
		
		System.out.println("El resultado es: " + resultado);
		
		
		
		scan.close();
	}

}
