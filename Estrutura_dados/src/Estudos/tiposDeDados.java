package Estudos;

public class tiposDeDados {

    public static void main(String[] args) throws Exception {

        // Variaveis do tipo inteiro

        byte numeroPequeno = 127;
        short numeroShort = 32767;
        int numeroMaior = 214783647;
        long numeroGrande = 922337203685477000l;

        System.out.println(numeroPequeno);
        System.out.println(numeroShort);
        System.out.println(numeroMaior);
        System.err.println(numeroGrande); // syste.out.err ele imprime no console De vemelho

        // variaveis com ponto flutuante
        // no padrão americano é utilizado o ponto em ves da virgula
        // tem que colocar o f de float no final
        float peso = 70.5f;
        double pi = 2.4278634543743631346316543125431234; // dobro do valor

        System.out.println(peso);
        System.out.println(pi);

        // variaveis do tipo caracter
        // so armazerna um caracter
        char letraUnica = '+';

        System.out.println(letraUnica);

        // variavel do tipo boolean
        // true ou false
        boolean casado = true;
        System.out.println(casado);

        // variaveis do tipo string
        // tem que ser aspas Duplas

        String nomeCompleto = "Israel cutodio dos santos";

        System.out.println(nomeCompleto);

    }
}
