package ex03;

public class Principal {

    String nome;
    int forca;
    float dano;

    void Status() {

        System.out.format("Meu nome é %s \n", nome);
    }

    void Atacar(String Ataque, int AtacouBasicoVida) {
        if (AtacouBasicoVida >= 1) {
            System.out.format("  %s bateu em %s causou %.0f%% de dano, Sua vida dimunuio em %d%% de dano", Ataque, nome, dano, AtacouBasicoVida);
        } else {
            System.err.println("Nao causou nenum dano");

        }
    }
}
