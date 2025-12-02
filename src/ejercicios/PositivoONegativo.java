package ejercicios;

import java.util.Scanner;

public class PositivoONegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num, mayor, igual, menor;
		
		System.out.println("Introduce cinco números: ");
		igual = 0;
		mayor = 0;
		menor = 0;
		
		for (int i = 0; i < 5; i++) {
			num = sc.nextInt();
			if (num == 0) {
				igual++;
			} else if (num < 0) {
				menor++;
			} else {
				mayor++;
			}
			
		}
		
		System.out.printf("El total de números mayores a 0 es %d\n El total de números iguales a 0 es %d\n El total de números menores a 0 es %d\n", mayor, igual, menor);
		
		
		sc.close();
	}

}
