package calculos;

import java.util.Scanner;

public class MaiorMenorSemCondicional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro ");
        int primeiro = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int segundo = scanner.nextInt();

        int maior = Math.max(primeiro, segundo);
        int menor = Math.min(primeiro, segundo);

        System.out.println("O maior numero: " + maior);
        System.out.println("O menor numero: " + menor);

        scanner.close();
    }
}
