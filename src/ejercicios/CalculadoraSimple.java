package e
import java.util.Scanner;

public class CalculadoraSimple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, suma, resta, multiplicacion;
		
		System.out.println("Dame dos números:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		
		System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);
		
		System.out.println("La resta de " + num1 + " y " + num2 + " es " + resta);
		
		System.out.println("La multiplicación de " + num1 + " y " + num2 + " es " + multiplicacion);
		
		scan.close();

	}

}
