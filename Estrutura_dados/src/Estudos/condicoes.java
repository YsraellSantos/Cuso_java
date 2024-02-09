package Estudos;

public class condicoes {
    public static void main(String[] args) {
        boolean estachovendo = false;
        boolean temQuardaChuva = true;

        if ( estachovendo == true && temQuardaChuva == true) {
            System.err.println("Podemos sair de casa");
        }
        else if (estachovendo == true || temQuardaChuva != false) {
            System.err.println("Podemo sair de casa, mais tem o risco de se molhar");
        }
        if ( estachovendo == temQuardaChuva) {
                System.err.println("Podemos sair de casa");
        } else {
            System.out.println("Vamos fivar em casa");
        }
        
       

    }
}
