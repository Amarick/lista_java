package aritmeticasimples;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da diagonal do quadrado: ");
        double diagonal = scanner.nextDouble();

        double area = Math.pow(diagonal, 2) / 2;

        System.out.println("A área do quadrado é: " + area);

        scanner.close();
    }
}
