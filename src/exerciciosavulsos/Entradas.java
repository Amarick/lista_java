package exerciciosavulsos;

import java.util.Scanner;

public class Entradas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double p1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double p2 = scanner.nextDouble();

        double soma = p1 + p2;
        double substracao = p1 - p2;
        double multiplicacao = p1 * p2;
        double divisao = p1 / p2;

        System.out.println("Soma: " + soma);
        System.out.println("Substração: " + substracao);
        System.out.println("Multiplicação:" + multiplicacao);
        System.out.println("Divisão: " + divisao);

        scanner.close();

    }
}
