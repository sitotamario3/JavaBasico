package ejercicios;

import java.util.Scanner;

public class MediaEdades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double n1, suma, a;
		
		System.out.println("Introduce la edad de la primera persona: ");
		
		n1 = sc.nextDouble();
		suma = 0;
		a = 0;
		
		 while (n1 > -1) {
			suma += n1;
			a++;
			System.out.println("Introduce la edad de la siguiente persona: ");
			n1 = sc.nextDouble();
			
		}
		
		
		System.out.println("La media de las edades introducidas es: " + suma / a);
		
		
		sc.close();
	}

}
