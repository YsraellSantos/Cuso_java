package Estudos;

import javax.swing.JOptionPane;

public class ExibindoNaTela {
  public static void main(String[] args) {

    String filme = JOptionPane.showInputDialog(null, "Digite seu filme Preferido ??", "Filme",
        JOptionPane.WHEN_IN_FOCUSED_WINDOW);
    String numero = JOptionPane.showInputDialog(null, "Digite um numero ?", "filme",
        JOptionPane.WHEN_IN_FOCUSED_WINDOW);

    // conveção
    int convercao = Integer.parseInt(numero);
    final int cal = convercao - 2023;

    // Impremindo na tela
    JOptionPane.showMessageDialog(null, "Filme preferido: " + filme, "Mensagem", JOptionPane.INFORMATION_MESSAGE, null);
    JOptionPane.showMessageDialog(null, "O número digitado foi: " + numero + "\nResultado do cálculo: " + cal,
        "Mensagem", JOptionPane.INFORMATION_MESSAGE, null);

    // Treino
    System.out.println("Informe os dados pesssoais");

    String nome = JOptionPane.showInputDialog(null, "Informe sue nome completo: ", "Nome",
        JOptionPane.WHEN_IN_FOCUSED_WINDOW);
    String idade = JOptionPane.showInputDialog(null, "Infome sua idade", "Idade", JOptionPane.WHEN_IN_FOCUSED_WINDOW);

    JOptionPane.showMessageDialog(null, "Sue nome é " + nome, "Nome", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Sua idade é " + idade, "Idade", JOptionPane.INFORMATION_MESSAGE);

    // converção
    int comverf = Integer.parseInt(idade);
    final int calculoo = comverf - 2023;

    JOptionPane.showMessageDialog(null, "O ano que você nasceu foi " + calculoo, "Ano",
        JOptionPane.WHEN_IN_FOCUSED_WINDOW);

  }

}
