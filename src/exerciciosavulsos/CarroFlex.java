package exerciciosavulsos;

import java.util.Scanner;

public class CarroFlex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do Alcool:");
        double alcool = scanner.nextDouble();

        System.out.println("Digite o valor da Gasolina: ");
        double gasolina = scanner.nextDouble();

        if (alcool < 0.7 * gasolina) {
            System.out.println("Abastecer com Alcool");
        }
        else {
            System.out.println("Abastecer com Gasolina");
        }
        scanner.close();
    }
}
