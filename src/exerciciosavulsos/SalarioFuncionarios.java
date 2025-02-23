package exerciciosavulsos;

import java.util.Scanner;

public class SalarioFuncionarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sálario fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Quais foram suas vendas mensais:");
        int vendasMensais = scanner.nextInt();

        double comissao = vendasMensais * 0.15 ;

        System.out.println("Nome do Funcionario: " + nome );
        System.out.print("Salario fixo: " + salarioFixo );
        System.out.print("Total de vendas: " + vendasMensais );

        double salarioMensal = comissao + salarioFixo;
        System.out.printf("A comissao desse mês foi de R$ %.2f e o seu salario mensal sera de R$ %.2f\n", comissao , salarioMensal);

        scanner.close();

    }
}
