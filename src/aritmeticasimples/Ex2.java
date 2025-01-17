package aritmeticasimples;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da aresta: ");
        int aresta = scanner.nextInt();

        double area = Math.pow(aresta, 2);

        System.out.println("A área do quadrado é: " + area);

        scanner.close();
    }
}
