package ex01;
public class App {
    public static void main(String[] args) throws Exception {
        // aphone 12 , tela de 4,2 , 256gb
        // Galaxy note 20ulta, t3ela de 6,6 , 256gb
        // Xiaomi MI 11 pro, tela de 6,81" , 128bg

        Celular ModeloIOS = new Celular();
        ModeloIOS.nome = "iPhoe 12";
        ModeloIOS.SistemaOperacional = "IOS";
        ModeloIOS.memoria = 256;
        ModeloIOS.tamanhoTela = 6.1f;

        System.out.format(
                "Celular %s, Com a tela de %.1f ploegadas, Com o sitema operacional %s, e com o armazenamento de %dbg  ",
                ModeloIOS.nome, ModeloIOS.tamanhoTela, ModeloIOS.SistemaOperacional, ModeloIOS.memoria);

        Celular ModeloAndrid = new Celular();
        ModeloAndrid.nome = "Galaxy note 20ulta";
        ModeloAndrid.SistemaOperacional = "Android";
        ModeloAndrid.memoria = 256;
        ModeloAndrid.tamanhoTela = 6.6f;

        System.out.format(
                "\n%s, Com a tela de %.1f ploegadas, Com o sitema operacional %s, e com o armazenamento de %dbg  ",
                ModeloAndrid.nome, ModeloAndrid.tamanhoTela, ModeloAndrid.SistemaOperacional, ModeloAndrid.memoria);

        Celular MOdeloXiaomi = new Celular();
        MOdeloXiaomi.nome = "Xiaomi MI 11 pro";
        MOdeloXiaomi.SistemaOperacional = "Andorid";
        MOdeloXiaomi.memoria = 128;
        MOdeloXiaomi.tamanhoTela = 6.81f;

        System.out.format(
                "\nCelular %s, Com a tela de %.1f ploegadas, Com o sitema operacional %s, e com o armazenamento de %dbg  ",
                MOdeloXiaomi.nome, MOdeloXiaomi.tamanhoTela, MOdeloXiaomi.SistemaOperacional, MOdeloXiaomi.memoria);

    }
}