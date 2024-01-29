package ex03;

public class Personagem {
  

    public static void main(String[] args) throws Exception {
        
       Principal personagem = new Principal();
       personagem.nome = "Naruto";
       personagem.forca = 10;
       personagem.dano = 15f;

        personagem.Status();
        personagem.Atacar("Sacura",3);

    }
}
