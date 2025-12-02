package ejercicios;

import java.util.Scanner;

public class MenuPersistente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int elecc;
		
		do {
			elecc = sc.nextInt();
			if (elecc < 1 || elecc > 4) {
				System.out.println("Hola! Selecciona una de las siguientes opciones: ");
				System.out.println("Elige 1 para recibir un saludo: ");
				System.out.println("Elige 2 para recibir la hora actual: ");
				System.out.println("Elige 3 para recibir un agradecimiento: ");
				System.out.println("Elige 4 para salir del menu");
			} else {
				System.out.println("Por favor selecciona un numero del 1 al 4");
			}
			while (elecc != 0) {
				
			}
		
		sc.close();
	}

}
