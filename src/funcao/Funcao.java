package funcao;

import java.util.Scanner;

public class Funcao {
   static Scanner scanner = new Scanner(System.in);
    static void somar() {

        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.println(" Digite o Segundo numero: ");
        int numero2 = scanner.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("Resultado " + resultado);
    }

    static void subtrair() {
        System.out.println("Digite o primeiro numero ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        int numero2 = scanner.nextInt();

        int resultado = numero1 - numero2;

        System.out.println("Resultado: "+ resultado);

    }

    static void multiplicar() {
        System.out.println("Digite o primeiro numero ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        int numero2 = scanner.nextInt();

        int resultado = numero1 * numero2;

        System.out.println("Resultado: "+ resultado);
    }

    static void dividir() {

        System.out.println("Digite o primeiro numero ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        int numero2 = scanner.nextInt();

        if (numero2 != 0) {
            int resultado = numero1 / numero2;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
    }
    public static void main(String[] args) {


        while(true) {
        System.out.println("Escolha uma das opções para realizar uma operação: ");
        System.out.println("1 - somar | 2 - subtrair | 3 - multiplicar | 4 - dividir  | 5 - sair");
        int opcao = scanner.nextByte();

        if(opcao == 5) {
            System.out.println("Saindo....");
            break;
        }

        switch(opcao) {
            case 1: somar(); break;
            case 2: subtrair(); break;
            case 3: multiplicar(); break;
            case 4: dividir(); break;
            default: System.out.println("Opção Errada");

        }

    }
  }
}


