package ExBanco;

/**
 *
 * @author Andrey Dalosto
 */
public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    public ContaPoupanca(String cliente, int numConta, double saldo, int diaRendimento){
       super(cliente, numConta, saldo);
       this.diaRendimento = diaRendimento;
    }
    
    public void calcularNovoSaldo(float taxa){
        double x = this.getSaldo();
        x += x*taxa;
        this.setSaldo(x);
    }
    
    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    
}