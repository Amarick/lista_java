package exerciciosavulsos;

import java.util.Scanner;

public class ConsumoMedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância total percorrida (em km):");
        double distancia = scanner.nextDouble();

        System.out.println("Digite o total de combustível gasto (em litros):");
        double combustivel = scanner.nextDouble();

        double consumo = distancia / combustivel;

        System.out.println("O consumo medio do combustivel " + consumo + " Km/l");

        scanner.close();
    }
}
