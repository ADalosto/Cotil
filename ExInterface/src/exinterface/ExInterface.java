package exinterface;

public class ExInterface {
    public static void main(String[] args) {
        LojaDoJoJo lj= new LojaDoJoJo();
        lj.gerarCupom();
        System.out.println(lj.calcEstoque("nike cano alto", 42));
        
        LojaSinatora ls= new LojaSinatora();
        ls.gerarCupom();
        ls.setCnpj("1234");
        
        
        ILoja jojo=new LojaDoJoJo();
        jojo.gerarCupom();
    }
    
}
