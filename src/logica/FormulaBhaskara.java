package logica;

import java.util.Scanner;

public class FormulaBhaskara {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorA = Double.parseDouble(scanner.next().replace(',', '.'));

        double valorB = Double.parseDouble(scanner.next().replace(',', '.'));

        double valorC = Double.parseDouble(scanner.next().replace(',', '.'));

        scanner.close();

        double calculoDelta = valorB * valorB - 4 * valorA * valorC;

        if (valorA == 0 || calculoDelta < 0) {
            System.out.println("Impossivel calcular");
        }else {
            double x1 = (-valorB + Math.sqrt(calculoDelta)) / (2 * valorA);
            double x2 = (-valorB - Math.sqrt(calculoDelta)) / (2 * valorA);

            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);
        }
    }
}
