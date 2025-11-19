package ejercicios;

import java.util.Scanner;

public class AreaRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double longitud, altura, area;
		
		System.out.println("Dame la altura y la base del rectángulo en cm para obtener su área:");
		
		longitud = scan.nextDouble();
		altura = scan.nextDouble();
		area = longitud * altura;
		
		System.out.println("El área del rectángulo es de: " + area + " cm2");		
		
		
		scan.close();
	}

}
