import java.util.Arrays;

import javax.swing.JOptionPane;

public class criandoArrays {
    public static void main(String[] args) {

       // formula 1

        int[] numero = new int[5]; // começa em 0

        numero[0] = 1; // numero na posição 0
        numero[1] = 2;
        numero[2] = 3;
        numero[3] = 4;
        numero[4] = 5;

        for (int posicao = 0; posicao < 5; posicao++) {
        System.out.println("Posição " + numero[posicao]);
        }

        // formula 2

        String[] nome = new String[] {
        "Maria", "João", "Pedro", "Andre", "Tiago"
        };

        for (int res = 0; res < 5; res++) {
        System.out.println("Meu nome é " + nome[res]);
        }

        // formula 3

        int[] numerosCidade = new int[10]; // tamanho do vetor de quantas posições
        Arrays.fill(numerosCidade, 0); // Prennche o Array com o valor que for
       // definifo [0]
        // Arrays.toString(numerosCidade) inprime todos os valores
        System.err.println("A posição do meu vetor é " +
        Arrays.toString(numerosCidade));

        System.err.println(numerosCidade.length); // inprime o tamonho do meu vetor

        String[] filme = new String[] {
                "Vingadores", // posição 0
                "Liga da justiça", // posição 1
                "Homem de ferro", // posição 2
                "Jardin do eden", // posição 3
                "Sair" // posição 4
        };

        int opcaoEscolhida = 0;
        while (opcaoEscolhida != 4) {
            opcaoEscolhida = JOptionPane.showOptionDialog(null,
                    "Qual o filme você ja assitio ?",
                    "Filme",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    filme,
                    0);

            if (opcaoEscolhida != 4) {
                String mesagem = "Você assistio " + filme[opcaoEscolhida];
                JOptionPane.showMessageDialog(null, mesagem);
        
            }
            else{

                JOptionPane.showMessageDialog(null, "Fim do pragrama", "Fim", JOptionPane.INFORMATION_MESSAGE);
            }


            
        }

    }

}
