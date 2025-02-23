package exerciciosavulsos;

import java.util.Scanner;


public class Jokenpo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Pedra:");
        System.out.println("2. Papel:");
        System.out.println("3. Tesoura:");
        System.out.print("Escolha a opção desejada: ");
        int jogador = scanner.nextInt();

        switch (jogador) {
            case 1:
                System.out.println("Jogador escolheu Pedra");
                break;
            case 2 :
                System.out.println("jogador escolheu Papel");
                break;
            case 3:
                System.out.println("Jogador escolheu Tesoura");
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }

        int computador = (int) (Math.random() * 3 + 1);
        scanner.close();

        switch (computador) {
            case 1:
                System.out.println("Computador escolheu Pedra");
                break;
            case 2:
                System.out.println("Computador escolheu Papel");
                break;
            case 3:
                System.out.println("Computador escolheu Tesoura");
                break;
        }

        if (jogador == computador) {
            System.out.println("Empate");
        }
        else if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)) {
            System.out.println("Jogador Venceu");
        }
        else {
            System.out.println("Computador Venceu");
        }

    }
}

