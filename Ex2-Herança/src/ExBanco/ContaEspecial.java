package ExBanco;

/**
 *
 * @author Andrey Dalosto
 */
public class ContaEspecial extends ContaBancaria {
    private float limite;


    public ContaEspecial (String cliente, int numConta, double saldo, float limite){
        super(cliente, numConta, saldo);
        this.limite = limite;
    }
    
    
    @Override
    public void sacar(float var){
        if (this.getSaldo() + limite < 0){
            System.out.println("==========Falha na execução==========");            
            System.out.println("Não é possível sacar este valor");
        } else{
            double x = this.getSaldo();
            x -= var;
            this.setSaldo(x);
        }
    }
    

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
}