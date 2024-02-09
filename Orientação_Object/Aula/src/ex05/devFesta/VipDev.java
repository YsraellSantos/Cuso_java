package ex05.devFesta;

class VipDev {
    private int quantidadeCafé = 30;
    private int quantidadeSalgado = 50;
    private int coxinha = 70;

    private void bebeuCafe() {
        System.out.println("Bebeu uma xicara de café");
        quantidadeCafé--;
      
    }

    private void comeuSalgado() {
        System.out.println("Comeu 5 salgado");
        quantidadeSalgado--;
        

    }

    private void comeuCoxinha(){
        System.out.println("Comeu 1 coxiha");
        coxinha--;
    }

    public void PessoaVip (){
         comeuSalgado();
         bebeuCafe();
         comeuCoxinha(); 
    }
}
