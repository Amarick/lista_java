package exerciciosavulsos;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double p1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double p2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double p3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double p4 = scanner.nextDouble();

        double media = (p1 + p2 + p3 + p4) / 4.0;

        System.out.printf("Media final: %.2f\n" , media);

        scanner.close();

    }
}
