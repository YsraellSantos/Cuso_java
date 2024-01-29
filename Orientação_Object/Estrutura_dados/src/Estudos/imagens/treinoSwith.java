package Estudos.imagens;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class treinoSwith {
    public static void main(String[] args) {
          String personagem =  JOptionPane.showInputDialog(null, "Escolha um personagem", "Anime Goku", JOptionPane.WHEN_IN_FOCUSED_WINDOW);

            String origem = "";
            String nomeImagem = "";

            switch (personagem) {
                case "Goku":
                    origem = "Planeta Sayadin";
                    nomeImagem = "goku-icone";
                    break;
                case "Piccolo":
                    origem = "Planeta Namekusedin";
                    nomeImagem = "piccolo-icone";
                    break;
                case "Vageta":
                    origem = "Planeta Sayadin";
                    nomeImagem = "vageta-icone";
                    break;
                case "Bulma":
                    origem = "Planeta Terra";
                    nomeImagem = "bulma-icone";
                    break;
                case "Kuririn":
                    origem = "Planeta Terra";
                    nomeImagem = "Kuririn-icone";
                    break;

                default: 
                origem = "Planeta desconhecida";
                nomeImagem = "default";
                

            }

            String caminhoImagen = String.format("C:\\Users\\ysrae\\OneDrive\\Desktop\\Porjetos-Java\\Cuso_java\\Estudos\\src\\Estudos\\imagens\\%s.png", nomeImagem);  // tem que colocar 2 barra, ou pode colocar a barra imvertida \
            //C:\Users\ysrae\OneDrive\Desktop\Porjetos-Java\Cuso_java\Estudos\src\Estudos\imagens\bulma-icone.png   caminho da imagem 
            ImageIcon  icone= new ImageIcon(caminhoImagen);
            String informacoesPersonagem = String.format( "Personagem: %s \nOrigem: %s" , personagem, origem);     
            JOptionPane.showConfirmDialog(null, informacoesPersonagem, "Descrição" ,JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icone);
        }
    }

