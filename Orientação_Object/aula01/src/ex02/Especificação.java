package ex02;

public class Especificação {
    public static void main(String[] args) {
        // fusion motor 2.0 tubo altomatico cor preta
        // corola motod 2.0 altomatico cor prata
        // Civicy motor 1.8 manual cor azul

        Carro ModeloFusion = new Carro();
        ModeloFusion.nome = "Ford Fusion Titanium AWD";
        ModeloFusion.motor = "2.2Turbo";
        ModeloFusion.cor = "Preta";
        ModeloFusion.altomatico = "altomatico de 6 maxas";

        System.err.format("%s na cor %s:  Com um motor de %s: Com um cambio %s \n", ModeloFusion.nome, ModeloFusion.cor, ModeloFusion.motor, ModeloFusion.altomatico  );

        Carro ModeloCorola = new Carro();
        ModeloCorola.nome = "Corolla Altis Premium ";
        ModeloCorola.motor = "Corolla Altis 1.8 Hybrid Flex";
        ModeloCorola.cor = "Preto";
        ModeloCorola.altomatico = "altomatico de 8 maxas";
        
        System.out.format("%s na cor %s:  Com um motor de %s: Com um cambio %s\n" , ModeloCorola.nome, ModeloCorola.cor, ModeloCorola.motor, ModeloCorola.altomatico );

        Carro ModeloCivicy = new Carro();
        ModeloCivicy.nome = "Civic Híbrido.";
        ModeloCivicy.motor = "1.8 Altomatico";
        ModeloCivicy.cor = "Azul";
        ModeloCivicy.altomatico = "Altoimatico de 8 maxas";

        System.out.format("%s na cor %s:  Com um motor de %s: Com um cambio %s " , ModeloCivicy.nome, ModeloCivicy.cor, ModeloCivicy.motor, ModeloCivicy.altomatico );
    }
}
