package ex04;

public class Celular {
    String nome;
    String processador;
    String SistemaOperacional;
    String memoria;
    int armazenamento;
    float tamanhoTela;
   

    void Status15ProMax() {
        System.out.format(
                "modelo da %s com o sistema operacional %s: com uma memoria ram de %s: com um processador %s: Com um armazenamneto %d : e com uma tela de %.1f polegadas: \n\n",
                nome,
                SistemaOperacional, memoria, processador, armazenamento, tamanhoTela);
    }

    void Status15Pro() {
        System.out.format(
                "modelo da %s com o sistema operacional %s: com uma memoria ram de %s: com um processador %s: Com um armazenamneto %d : e com uma tela de %.1f polegadas: \n\n ",
                nome,
                SistemaOperacional, memoria, processador, armazenamento, tamanhoTela);
    }

    void Status15() {
        System.out.format(
                "modelo da %s com o sistema operacional %s: com uma memoria ram de %s: com um processador %s: Com um armazenamneto %d : e com uma tela de %.1f polegadas: ",
                nome,
                SistemaOperacional, memoria, processador, armazenamento, tamanhoTela);
    }

}
