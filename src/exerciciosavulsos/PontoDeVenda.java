package exerciciosavulsos;

import java.util.Scanner;

public class PontoDeVenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total das Compras: ");
        double valorTotal = scanner.nextDouble();

        System.out.print("Digite a porcetagem de desconto: ");
        double desconto = scanner.nextDouble();

        double valorComDesconto = valorTotal - (desconto * valorTotal) / 100;

        System.out.println("Total com desconto: " + valorComDesconto);

        System.out.print("Digite o pagamento das compras: ");
        double pagamento = scanner.nextDouble();

        double troco = pagamento - valorComDesconto;

        System.out.print("Troco: " + troco);

        scanner.close();
     }
}
