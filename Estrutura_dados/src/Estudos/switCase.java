import javax.swing.JOptionPane;

public class switCase {
 
    /**
     * @param args
     */
    public static void main(String[] args) {

   String diaDasemana =JOptionPane.showInputDialog(null,"Qual dia da semana nos estamos", "Dia da semana", JOptionPane.WHEN_IN_FOCUSED_WINDOW);
   
        switch (diaDasemana) {

            case "Domingo":
                System.out.println("Estamos no domingo " + diaDasemana);
            break;
            
            case "Segunda":
                System.out.println(diaDasemana);
            break;

            case "Terça":
                System.out.println(diaDasemana);
            break;

            case "Quarta-Feira":
                System.out.println(diaDasemana);
                break;
            case "Quinta-Feira":
                System.out.println(diaDasemana);
            break;

            case "Sexta-Feira":
                System.out.println(diaDasemana);
            break;

            case "Sabado":
                System.out.println(diaDasemana);
            break;

            default:
                System.err.println("O dia da semana não existe no nosso calendario");
         
        }

    }
    
 }

 
