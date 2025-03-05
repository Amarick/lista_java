package logicainicial;

import javax.swing.JOptionPane;

public class EntradaGrafica {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("qual o seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade: "));

        JOptionPane.showMessageDialog(null, "Seu nome é " + nome + " e voce tem  " + idade + " anos de idade"  );
    }
}
