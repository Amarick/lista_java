package aritmeticasimples;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double Fahrenheit = (celsius * 1.8) + 32;

        System.out.println("O equivalente em Fahrenheit: " + Fahrenheit);

        scanner.close();

    }
}
