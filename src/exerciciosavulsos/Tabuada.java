package exerciciosavulsos;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero");
        int tabuada = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = tabuada * i;
            System.out.println(tabuada + " X " + i + " = " + resultado);
        }
    }
}
