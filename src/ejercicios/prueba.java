package ejercicios;

import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un dia de la semana");
        String weekday = sc.nextLine();
        
        switch (weekday) {
        case "Monday", "Tuesday", "Wednesday" -> System.out.println("It is a weekfdag");
        case "saturday", "sunday" -> System.out.println("It is a weeknd day");
        default -> System.out.println("It is not a day");
        }
        
        sc.close();
    }
}
