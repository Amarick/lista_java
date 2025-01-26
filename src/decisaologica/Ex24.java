package decisaologica;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Entre com o segundo valor: ");
        int valor2 = scanner.nextInt();

        System.out.println("Entre com o terceiro valor: ");
        int valor3 = scanner.nextInt();

        if ( valor1 > valor2 && valor1 > valor3) {
            System.out.println("O primeiro valor digitado é o maior");
        }
        else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("O segundo valor digitado é o maior");
        }
        else if(valor3 > valor1 && valor3 > valor2){
            System.out.println("O terceiro valor digitado é o maior");
        }
        else {
            System.out.println("0s valores digitados foram iguais");
        }

        scanner.close();
    }
}
