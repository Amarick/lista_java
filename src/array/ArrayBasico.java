package array;

public class ArrayBasico {
    public static void main(String[] args) {
        String[] carro = {"Ferrari", "Camaro", "Fusca", "Uno" };
        System.out.println("Tamanho do Array: " + carro.length);
        System.out.println("Carro: " + carro[3]);
        carro[3] = "Volvo";
        System.out.println("Carro: " + carro[3]);

        System.out.println("Carros:");
        for (int i = 0; i < carro.length; i++) {
            System.out.println(carro[i]);
        }
    }
}
