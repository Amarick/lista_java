package exerciciosavulsos;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("IMC %.2f\n" , imc);
        scanner.close();

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (imc < 25) {
            System.out.println("Peso ideal");
        }
        else if (imc < 30) {
            System.out.println("Levemente acima do peso");
        }
        else if (imc < 35) {
            System.out.println("Obesidade grau I ");
        }
        else if (imc < 40) {
            System.out.println("Obesidade grau II(severa)");
        }
        else {
            System.out.println("Obesidade grau III (mórbida)");
        }
    }
}
