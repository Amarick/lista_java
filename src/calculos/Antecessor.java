package calculos;


import javax.swing.JOptionPane;

public class Antecessor {
    public static void main(String[] args) {

       String input = JOptionPane.showInputDialog(" Digite um numero: ");
       int numero =  Integer.parseInt(input);

       int antecessor = numero -1;

      JOptionPane.showMessageDialog(null, "Antecessor " + antecessor);

    }
}
