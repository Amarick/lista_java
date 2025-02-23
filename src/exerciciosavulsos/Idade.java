package exerciciosavulsos;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a sua data de nascimento: ");
        int nascimento = scanner.nextInt();

        System.out.println("Entre com o ano atual:");
        int anoAtual = scanner.nextInt();

        int idade = anoAtual - nascimento;

        System.out.println(idade);
        scanner.close();
    }
}
