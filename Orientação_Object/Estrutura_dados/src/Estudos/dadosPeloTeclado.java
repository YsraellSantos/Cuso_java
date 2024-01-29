package Estudos;
import java.util.Scanner;

public class dadosPeloTeclado {
    
public static void main(String[] args) {
    try (Scanner leitor = new Scanner(System.in)) {
        leitor.useDelimiter("[\r\n]+");
       
        // variaveis
        int numero;
        float peso;
        String jogo;

        System.err.println("Digite um numero");
        numero = leitor.nextInt();
      

        System.err.println("Digite seu peso");
        peso = leitor.nextFloat();                  // tem que digitar com a virgula
       
        
        System.out.println("Qual o seu jogo atual? ");
        jogo = leitor.next();
       

        System.out.println("O numero é "+ numero);
        System.out.println("O peso atual é " + peso);
        System.out.println(" Meu jogo atual é " + jogo);

        leitor.nextLine();
    } 
    
    }
   
}

