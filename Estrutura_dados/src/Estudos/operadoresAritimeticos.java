package Estudos;

import javax.swing.JOptionPane;

public class operadoresAritimeticos {
    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 30;

        int resultadoMultiplicacao = numero1 + numero2;
        JOptionPane.showMessageDialog(null,
                "O soma entre os numero " + numero1 + " e o numero " + numero2 + " é " + resultadoMultiplicacao,
                "Multiplicação", JOptionPane.INFORMATION_MESSAGE);

        int menor1 = 100;
        int menor2 = 30;

        int resultadoMenor = menor1 - menor2;
        JOptionPane.showMessageDialog(null,
                "A subitração entre os numero " + menor1 + " e o numero " + menor2 + " é " + resultadoMenor,
                "Subtração", JOptionPane.INFORMATION_MESSAGE);

        int divisor = 2;
        float dividendo = 50;

        float resultadoDividendo = (float) (dividendo / divisor);
        JOptionPane.showMessageDialog(null,
                "A divisão do " + dividendo + " dividi por " + divisor + " é " + resultadoDividendo, null,
                JOptionPane.INFORMATION_MESSAGE);

        int contodo = 11;
        int resto = 2;
        float res = contodo % resto;

        JOptionPane.showMessageDialog(null, res, "Resto", JOptionPane.INFORMATION_MESSAGE);

        int contador = +10;

        int contadorr = 10;

        contadorr = contadorr + 1; // formula 1
        contador++; // formula 2
        JOptionPane.showMessageDialog(null, contador, null, JOptionPane.INFORMATION_MESSAGE);
        contadorr++;
        JOptionPane.showMessageDialog(null, contador, null, JOptionPane.INFORMATION_MESSAGE);

        // fomula 4
        contador = contador + 12;
        ++contador;
        JOptionPane.showMessageDialog(null, contador, null, JOptionPane.INFORMATION_MESSAGE);

        // formula 5

        JOptionPane.showMessageDialog(null, ++contador, null, JOptionPane.INFORMATION_MESSAGE);

    }

}
