package Ejercicios;

import java.util.Scanner;

public class SaludoV2 {

	public static void main(String[] args) {
		// Creo el escaner para poder leer los datos 
				Scanner escaner = new Scanner(System.in);
				
				String nombre, apellido;
				
				// Pregunto cómo se llama
				System.out.print("Hola, cómo te llamas?:");
				nombre = escaner.nextLine();
				apellido = escaner.nextLine();
				
				System.out.print("Hola " + nombre + " " + apellido + ", ¿Qué tal estás?");
				escaner.close();
	}

}
