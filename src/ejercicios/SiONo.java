package ejercicios;

import java.util.Scanner;

public class SiONo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String resp;
		
		System.out.println("¿Quieres continuar?: (s/n)");
		resp = sc.nextLine();
		
		while (!resp.equals("S") && !resp.equals("s") && !resp.equals("N") && !resp.equals("n")) {
			System.out.println("¿Quieres continuar?: (s/n)");
			resp = sc.nextLine();
		}
		
		
		
		sc.close();
	}

}
