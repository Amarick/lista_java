package aritmeticasimples;

import java.util.Scanner;
import java.lang.Math;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o raio da base: ");
        double raio = scanner.nextDouble();

        double volume = (1.0 / 3) * Math.PI * Math.pow(raio, 2) * altura;

        System.out.printf("Volume do cone %.2f\n" , volume);

        scanner.close();
    }
}
