package decisaologica;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Digite outro valor: ");
        int valor2 = scanner.nextInt();

        if (valor1 < valor2) {
            System.out.println("O menor valor foi o primeiro digitado");
        }
        else {
            System.out.println("O menor valor foi o segundo digitado");
        }

        scanner.close();
    }
}
