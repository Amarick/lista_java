package aritmeticasimples;

import java.util.Scanner;
import java.lang.Math;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o diametro do circulo:");
        double diametro = scanner.nextDouble();

        double area = Math.PI * Math.pow(diametro / 2, 2);

        System.out.printf("Area do circulo: %.2f\n " , area);

        scanner.close();
    }
}
