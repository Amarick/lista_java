package aritmeticasimples;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da resistência (em ohms): ");
        double resistencia = scanner.nextDouble();

        System.out.println("Digite o valor da corrente elétrica (em amperes): ");
        double corrente = scanner.nextDouble();

        double tensao = resistencia * corrente;

        System.out.printf("A tensão no circuito é: %.2f volts.\n" , tensao);

        scanner.close();
    }
}
