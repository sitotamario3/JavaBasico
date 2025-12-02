package ejercicios;

import java.util.Scanner;

public class SumarArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1, 2, 3, 4, 5};
		int suma = 0;
		
		
		for (int i = 0; i < arr.length; i++ ) {
			suma = suma + arr[i];
		}
		System.out.println(suma);
		
		
		sc.close();
	}

}
