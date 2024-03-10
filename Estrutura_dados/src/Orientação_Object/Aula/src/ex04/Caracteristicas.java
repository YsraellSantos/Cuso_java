package ex04;

public class Caracteristicas {
    public static void main(String[] args) {

        Celular Modelo15ProMax = new Celular();
        Modelo15ProMax.nome = "iPhoe 15 Pro-Max";
        Modelo15ProMax.SistemaOperacional = "IOS";
        Modelo15ProMax.armazenamento = 256;
        Modelo15ProMax.tamanhoTela = 6.1f;
        Modelo15ProMax.processador = " A15 Bionic,";
        Modelo15ProMax.memoria = " 8 GB";

        Celular Modelo15Pro = new Celular();
        Modelo15Pro.nome = "iPhoe 15 Pro";
        Modelo15Pro.SistemaOperacional = "IOS";
        Modelo15Pro.armazenamento = 128;
        Modelo15Pro.tamanhoTela = 6.1f;
        Modelo15Pro.processador = " A15 Bionic,";
        Modelo15Pro.memoria = " 8 GB";

        Celular Modelo15 = new Celular();
        Modelo15.nome = "iPhoe 15";
        Modelo15.SistemaOperacional = "IOS";
        Modelo15.armazenamento = 64;
        Modelo15.tamanhoTela = 6f;
        Modelo15.processador = " A15 Bionic,";
        Modelo15.memoria = " 6 GB";

        System.out.println("Seja bem vindo a nossa loja da Apple ");
        System.out.println("Qual celular você deseja compra ?");
        System.err.println("Opção 1: iPhone 15 Pro-Max");
        System.err.println("Opção 2: iPhone 15 Pro");
        System.err.println("Opção 3: iPhone 15");

        // Modelo15ProMax.Status15ProMax();
        // Modelo15Pro.Status15Pro();
        // Modelo15.Status15();
    }
}