package exinterface;
public class LojaDoJoJo extends Loja implements ILoja, ISapato {
   
    @Override
    public double calcDesconto() {
        return 0.1;
    }

    @Override
    public void gerarCupom() {
        System.out.println("Gerando cumpom JOJO10");
    }

    @Override
    public int calcEstoque(String modelo, int numero) {
        return 10;
    }
    
    
}
