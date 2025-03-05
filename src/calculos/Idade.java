package calculos;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );

        final int ANO_ATUAL = 2025;
        final int DIAS_POR_MES = 30;
        final int DIAS_POR_ANO = DIAS_POR_MES * 12;

        System.out.println("Qual a sua idade:");
        int idade = scanner.nextInt();

        int anoNascimento = ANO_ATUAL - idade;
        System.out.println("Voce nasceu em: " + anoNascimento);

        int diasVividos = idade * DIAS_POR_ANO;
        System.out.println("Voce viveu " + diasVividos + " dias de vida");

        scanner.close();

    }
}
