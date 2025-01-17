package aritmeticasimples;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor do diametro: ");
        double diametro = scanner.nextDouble();

        double volume = (1.0 / 6) * Math.PI * Math.pow(diametro,3);

        System.out.printf("Volume da esfera %.2f\n: " , volume);

        scanner.close();
    }
}
