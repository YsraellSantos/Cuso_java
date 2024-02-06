
import videos.*;

import javax.swing.JOptionPane;

import gui.*;
import gui.Botoes.*;

public class Principal {
    public static void main(String[] args) {

        // Campo do videos

        Filme filme = new Filme();
        // Conteudo
        Anime anime = new Anime();
        // Conteudo
        Documentario documento = new Documentario();
        // Conteudo
        Novela novela = new Novela();
        // Conteudo
        Serie serie = new Serie();
        // Campo do gui

        Janela janela = new Janela();
        // Conteudo
        MiniuaturaVideo miniuaturaVideo = new MiniuaturaVideo();
        // Conteudo

        // Campo dos botoes

        BotaoPause botaoPause = new BotaoPause();
        // Conteudo
        BotaoPlay botaoPlay = new BotaoPlay();
        // Conteudo
        BotaoVolta borBotaoVolta = new BotaoVolta();
        // Conteudo

    }
}
