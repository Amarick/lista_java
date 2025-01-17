package aritmeticasimples;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        double media = Math.sqrt(numero1 * numero2);

        System.out.println("A média geométrica é: " + media);

        scanner.close();
    }
}
