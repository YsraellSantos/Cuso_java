package ex05.netflix;

import java.util.Scanner;

public class Filme {
    Scanner teclado = new Scanner(System.in);

    private String idiomaPreferencial;
    private String resolucaoDaTela;

    public void entra() {

    }

    private void buscaPrferenciaDoUsuario() {
        System.out.println("Qual idioma Você prefere asssistir o filem?");
        idiomaPreferencial = teclado.nextLine();
        System.out.println(idiomaPreferencial);

    }

    private void assistirFilme(String nomeFilme) {
        System.out.println("Iniciando o filme" + nomeFilme);
    }

}
