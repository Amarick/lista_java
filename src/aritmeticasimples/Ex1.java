package aritmeticasimples;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor da base: ");
        int base =  scanner.nextInt();

        System.out.println("Entre com o valor da altura: ");
        int altura = scanner.nextInt();

        int area = base * altura;

        System.out.println("A área do retângulo é: " + area);

        scanner.close();
}
}
