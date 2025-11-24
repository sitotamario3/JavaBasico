package ejercicios;

import java.util.Scanner;

public class CuentaAtras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1, a;
		
		System.out.println("Escoge un número: ");
		num1 = sc.nextInt();
		a = num1;
		
		System.out.println("Cuenta atras!: ");
		
		for (int i = num1; i>=1; i--) {
			System.out.println(i);
		}
			
		System.out.println("Despegue!");
		
		while (a >= 1) {
			a--;
			System.out.println(a + 1);
		}
		System.out.println("Despegue!");
		
		sc.close();
	}

}
