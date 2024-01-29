package Estudos;

import java.util.Random;
import javax.swing.JOptionPane;

public class numerosAleatorios {
    public static void main(String[] args) {

        // int  numerosAleatorio = 1 + (int)(Math.random() * 100);  // 
        // JOptionPane.showMessageDialog(null, "O numero sorteado é " + numerosAleatorio , "Sorteio",JOptionPane.INFORMATION_MESSAGE);


        // Random gerador = new Random( );
        // int numero =  1 + gerador.nextInt(10); 
        // JOptionPane.showMessageDialog(null, "Numero sorteado é " + numero, "Sorteio", JOptionPane.INFORMATION_MESSAGE);

          Random gerador = new Random();
        String facesString = JOptionPane.showInputDialog(null, "Quantas faces o doda tem");
        int facesDados = Integer.parseInt(facesString);

        int resultado = 1 + gerador.nextInt(facesDados);
        JOptionPane.showMessageDialog(null,  "O numero sorteado foi " + resultado, "Dado", JOptionPane.INFORMATION_MESSAGE);

    }
  
    public class InnernumerosAleatorios {

      


      
        
    }
            

}
