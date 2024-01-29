import javax.swing.JOptionPane;

public class classeMath {
    public static void main(String[] args) {

        // função (abs)
        int numero = -50;
        int numero1 = 50;
        int res = Math.abs(numero); // todo numero que for negativo A função (abs) vai retorna ele positivo;
        int resultado = Math.abs(numero1); // Sedo que se o numero for positico ja retora altomaticamente positivo
        JOptionPane.showMessageDialog(null, res, null, JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, resultado, null, JOptionPane.INFORMATION_MESSAGE);

        int num = 10;
        int num1 = 20;
        int result = (int) Math.pow(num, num1); // Essa função ela faz o numero ao quadrado, a potencia
        JOptionPane.showMessageDialog(null, result, null, JOptionPane.INFORMATION_MESSAGE);

        double numer = Math.ceil(11.67); /// Arredonda pra cima
        System.out.println(numer);

        double n = Math.floor(1.8); // Arredonda pra baixo
        System.out.println(n);

        float op = 2023;
        float i = 20000;
        int resulti = (int) Math.min(i, op); // A função mim retoirna o menor valor entre as variaveis
        System.err.println(resulti);

        float e = 1;
        float r = 3;

        int tes = (int) Math.max(e, r); // valor maximo
        System.out.println(tes);

    }

}
