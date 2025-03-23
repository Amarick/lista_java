package calculos;

import java.util.Scanner;

public class Eleitores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o total de eleitores municipais:");
        double eleitores = input.nextDouble();

        System.out.println("Digite o número de votos válidos: ");
        double votosValidos = input.nextDouble();

        System.out.println("Digite o numero de votos brancos");
        double votosbrancos = input.nextDouble();

        System.out.println("Digite o numero de votos nulos");
        double votosnulos = input.nextDouble();


        double votosTotais = votosValidos + votosbrancos + votosnulos;

       if (votosTotais > 0) {

           double porcetagemBrancos = (votosbrancos * 100.0) / votosTotais;
           double porcetagemNulos = (votosnulos * 100.0) / votosTotais;
           double porcetagemValidos = (votosValidos * 100.0) / votosValidos;

           System.out.printf("Percentual de votos válidos:" , porcetagemValidos);
           System.out.printf("Percentual de votos brancos: %.2f%%\n" , porcetagemBrancos);
           System.out.printf("Percentual de votos nulos: %.2f%%\n" , porcetagemNulos);

       } else {
           System.out.println("Nenhum voto foi regristado.");
       }

       input.close();

    }
}
