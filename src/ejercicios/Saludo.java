package Ejercicios;

import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {
		// Creo el escaner para poder leer los datos 
		Scanner escaner = new Scanner(System.in);
		
		String nombre;
		
		// Pregunto cómo se llama
		System.out.print("Hola, cómo te llamas?:");
		nombre = escaner.nextLine();
		
		System.out.print("Hola " + nombre + ", ¿Qué tal estás?");
		escaner.close();
	}

}
