package calculos;


import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( " Digite a base do Retângulo: ");
        double base = scanner.nextDouble();

        System.out.println(" Digite a altura do Retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A area do Retãngulo: " + area);
    }
}
