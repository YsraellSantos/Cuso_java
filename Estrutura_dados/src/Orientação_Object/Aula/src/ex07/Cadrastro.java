package ex07;

import javax.swing.JOptionPane;

public class Cadrastro {
      private String nome;
    private String sobrenome;
    private String cpf;
    private String numeroRG;
    private String dataNascimento;
    private String endereco;
    private String nomeMae;
    private String nomePai;
    private String eend; 

    int resposta = 0;

    private void MensagemInicial() {
        JOptionPane.showMessageDialog(null, "Seja Bem-Vindo ao Banco Java", "Banco Java", JOptionPane.INFORMATION_MESSAGE);
    }

    private void Verificacao() {
        resposta = JOptionPane.showConfirmDialog(null, "Deseja fazer o cadastro?", "Banco Java", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Cadastro de Cliente", "Banco Java", JOptionPane.INFORMATION_MESSAGE);
          
        } else {
            JOptionPane.showMessageDialog(null,
                    "Havia um banco local chamado \"Banco da Colina Verde\", administrado pelo amável Sr.\n"
                            + "Oliveira. O banco não era apenas um lugar para guardar dinheiro, mas um ponto de\n"
                            + "encontro para os moradores locais. Um dia, uma jovem chamada Maria propôs um programa\n"
                            + "de empréstimo sem juros para impulsionar os pequenos negócios locais. Com o apoio do Sr. Oliveira,\n"
                            + "o programa prosperou, fortalecendo a economia e unindo a comunidade. Ao longo dos anos, o Banco da\n"
                            + "Colina Verde se tornou um símbolo de esperança e solidariedade, lembrando a todos que até os lugares\n"
                            + "mais simples podem ter um grande impacto nas vidas das pessoas.",
                    "História do Banco", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0); 
        }
    }

    private void NomeCliente1() {
        nome = JOptionPane.showInputDialog("Digite seu nome");
        sobrenome = JOptionPane.showInputDialog("Digite seu Sobrenome");
    }

    private void Dados() {

        do {
            cpf = JOptionPane.showInputDialog("Digite o número do seu CPF");
            numeroRG = JOptionPane.showInputDialog("Digite o número do seu RG");

            if (cpf.length() < 11 || numeroRG.length() < 7) {
                JOptionPane.showMessageDialog(null,
                        "O número CPF ou do RG está incorreto. Por favor, indique números válidos.");
            }
        } while (cpf.length() < 11 || numeroRG.length() < 7);

    }

    private void NasEnd() {

        do {
            dataNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento (dd/mm/aaaa):");
            if (dataNascimento.length() != 10) {
             
            }
        } while (dataNascimento.length() != 10);

    }

    private void PaiMae() {
        nomeMae = JOptionPane.showInputDialog("Digite o nome da sua mãe");
        nomePai = JOptionPane.showInputDialog("Digite o nome do seu pai");
    }

    public void endereco() {
        eend = JOptionPane.showInputDialog(null, "Digite seu endereço");
    }

    public void Mostrar() { 
        MensagemInicial();
        Verificacao();
        NomeCliente1();
        Dados();
        NasEnd();
        PaiMae();
        endereco();
    }
    
}
