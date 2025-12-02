package ejercicios;

import java.util.Scanner;

public class CuantoPago {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int meses;
        double pagoMes = 10;   // primer mes
        double total = 0;

        System.out.print("¿Cuántos meses va a pagar? ");
        meses = sc.nextInt();

        for (int i = 1; i <= meses; i++) {
            System.out.println("Mes " + i + ": " + pagoMes + " €");
            total += pagoMes;
            pagoMes *= 2;  // el siguiente mes se duplica
        }

        System.out.println("\nTotal pagado después de " + meses + " meses: " + total + " €");

        sc.close();
    }

}
