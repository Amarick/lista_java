package exerciciosavulsos;

import java.util.Scanner;

public class Eletromoveis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor das compras: ");
        double valor = scanner.nextDouble();

        double parcelas = valor / 5.0;

        System.out.printf("a compra de R$ %.2f sera parcelada em 5x sem juros\nvalor das parcelas R$ %.2f", valor, parcelas);


    }
}
