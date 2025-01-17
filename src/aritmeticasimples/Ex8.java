package aritmeticasimples;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em milhas marítimas: ");
        double milhasMaritimas = scanner.nextDouble();

        double quilometros = milhasMaritimas * 1852;

        System.out.printf("%.2f milhas marítimas equivalem a %.2f quilômetros.\n", milhasMaritimas, quilometros);

        scanner.close();
    }
}
