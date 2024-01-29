package Estudos;

public class InpriminVariaveis {
    public static void main(String[] args) {

        int idade = 10;
        int ano = 2023;
        String nome = "Israel custodio dos santos";
        char letra = 'y';

        // Formas de inprimir na tela
        System.out.println("Meu noome é " + nome + " Tenho " + idade + " anos, estamos no ano de " + ano
                + " minha letra preferida é " + letra);
        System.out.format("Meu nome é %s tenho %d anos ,  minha letra é preferifa %c, e estamos no ano de %d", nome,
                idade, letra, ano);

        String texto = "Meu noome e´" + nome + " Tenho " + idade + " anos, estamos no ano de " + ano + " minha letra é "
                + letra + "";
        String texto1 = String.format("Meu nome é %s tenho %d anos ,  minha letra é %c, e estamos no ano de %d", nome,
                idade, letra, ano);

        System.out.println("\n" + texto);
        System.err.println(" \n ->" + texto1);
    }

}
