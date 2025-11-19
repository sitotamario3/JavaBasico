package ejercicios;

import java.util.Scanner;

public class Media3Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double nota1, nota2, nota3, notaMedia;
		
		System.out.println("Dame las tres notas del examen para calcular la media: ");
		nota1 = scan.nextDouble();
		nota2 = scan.nextDouble();
		nota3 = scan.nextDouble();
		
		notaMedia = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("La nota media de las tres notas del examen es de: %.2f\n", notaMedia);
		
		
		scan.close();
	}

}
