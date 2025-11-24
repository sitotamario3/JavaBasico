package ejercicios;

import java.util.Scanner;

public class PotenciaSinFlecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 double base, resultado;
		 int expo;
		 
		 System.out.println("Programa calculador de potencias");
		 
		 System.out.println("Introduce la base");
		 base = sc.nextDouble();
		 resultado = 1;
		 
		 System.out.print("Introduce el exponente");
		 expo = sc.nextInt();
		 
		 for (int i = 1; i <= expo; i++) {
			 resultado = (base*base);
		 }
		 
		 System.out.println(resultado);
		 
		 
		
		sc.close();
	}

}
