package exerciciosavulsos;

import java.util.Scanner;

public class ConvertorFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus celsius: ");
        int celsius = scanner.nextInt();

        int Fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("Temperatura em Fahrenheit " + Fahrenheit);

        scanner.close();
    }
}
