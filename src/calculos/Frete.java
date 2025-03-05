package calculos;

import java.util.Scanner;

public class Frete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com os km rodados: ");
        double kmRodados = scanner.nextDouble();

        double taxa = 9.00;
        double vlFrete = (kmRodados * 1.50) + taxa;
        System.out.println("Valor do frete: " + vlFrete);

        scanner.close();
    }
}
