package exerciciosavulsos;

import java.util.Scanner;

public class ConversaoDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit:");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5 * (fahrenheit - 32)) / 9;

        System.out.printf("A temperatura %.2f em fahrenheit é equivalente á %.2fºC em celsius" , fahrenheit, celsius);

        scanner.close();
    }
}
