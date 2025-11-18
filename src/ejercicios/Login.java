package Ejercicios;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String user, contras;
		System.out.println("Inserta tu usuario: ");
		user = scan.nextLine();
		
		System.out.println("Inserta tu contraseña: ");
		contras = scan.nextLine();
		
		if (user.equals("admin") && contras.equals("1234")) {
			System.out.println("Acceso concedido");
		} else {
			System.out.println("Acceso denegado");
		}
		
		scan.close();
	}

}
