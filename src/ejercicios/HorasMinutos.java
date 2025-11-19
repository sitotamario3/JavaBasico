package ejercicios;

import java.util.Scanner;

public class HorasMinutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int min1, hor, min2;
		
		System.out.println("Dame la hora en minutos para obtener su equivalente en horas y minutos: ");
		min1 = scan.nextInt();
		
		hor = min1 / 60;
		min2 = min1 % 60;
		
		System.out.printf("%d minutos son %d horas y %d minutos", min1, hor, min2);
		
		
		scan.close();
	}

}
