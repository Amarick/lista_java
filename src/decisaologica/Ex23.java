package decisaologica;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor da base: ");
        double base = scanner.nextDouble();

        System.out.println("Entre com o valor da altura");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println(area);

        if (area > 100) {
            System.out.println("Terreno Grande");
        }
        else {
            System.out.println("Terreno Pequeno");
        }

        scanner.close();
    }
}
