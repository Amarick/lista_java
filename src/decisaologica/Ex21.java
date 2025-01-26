package decisaologica;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        if (valor1 > valor2) {
            System.out.println("O primeiro valor digitado é o maior");
        }
        else if (valor1 < valor2) {
            System.out.println("O segundo valor digitado é o maior");
        }
        else {
            System.out.println("Os valores digitados foram iguais");
        }

        scanner.close();
    }
}
