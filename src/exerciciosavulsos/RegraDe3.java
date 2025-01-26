package exerciciosavulsos;

import java.util.Scanner;

public class RegraDe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor:");
        double valor2 = scanner.nextDouble();

        double valorx = (valor1 * valor2) / 100;

        System.out.println(valor1 + " % de " + valor2 + " = " + valorx);

        scanner.close();
    }
}
