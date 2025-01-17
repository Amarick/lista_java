package aritmeticasimples;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        double p1 = scanner.nextDouble();

        System.out.println("Entre com a segunda nota: ");
        double p2 = scanner.nextDouble();

        System.out.println("Entre com a terceira nota: ");
        double p3 = scanner.nextDouble();

        System.out.println("Entre com a quarta nota: ");
        double p4 = scanner.nextDouble();

        double media = (p1 + p2 + p3 + p4) / 4;

        System.out.println("Media final: " + media);

        scanner.close();
    }
}
