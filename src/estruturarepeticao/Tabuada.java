package estruturarepeticao;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int tabuada = scanner.nextInt();

        for(int contador = 1; contador <= 10; contador++) {
             int resultado = tabuada * contador;

            System.out.println(tabuada + " X " + contador + " = " + resultado );
        }

        scanner.close();
    }
}
