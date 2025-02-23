package exerciciosavulsos;

import java.util.Scanner;

public class Dado {
    public static void main(String[] args) {
        char opcao = 's';
        Scanner scanner = new Scanner(System.in);

        while (opcao == 's') {
            System.out.println("Lançamento do Dado....");
            int dado = (int) (Math.random() * 6 + 1);
            System.out.println("Face:" + dado);

            System.out.println("Desejar jogar novamente (s/n) ? ");
            opcao = scanner.next().charAt(0);
        }

        scanner.close();
        
    }
}
