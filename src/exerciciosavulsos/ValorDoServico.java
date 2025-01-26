package exerciciosavulsos;

import java.util.Scanner;

public class ValorDoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o valor da remuneração mensal: ");
        double remuneracao = scanner.nextDouble();

        System.out.print("Entre com o custo de operação: ");
        double custoOperacao = scanner.nextDouble();

        System.out.print("Entre com a carga horaria de trabalho: ");
        double cargaHoraria = scanner.nextDouble();

        double horaDeTrabalho = (remuneracao + (remuneracao * 0.3) + custoOperacao + (remuneracao * 0.2)) / cargaHoraria;

        System.out.print("Valor da hora do serviço: " + horaDeTrabalho);

        scanner.close();
    }
}
