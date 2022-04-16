package ExBanco;

/**
 *
 * @author Andrey Dalosto
 */
public class ContaBancaria {
    private String cliente;
    private int numConta;
    private double saldo;

    public ContaBancaria(String cliente, int numConta, double saldo){
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }


    public void sacar(float var){
        if (saldo < 0){
            System.out.println("==========Erro==========");            
            System.out.println("Não é possível sacar esta quantia");
        } else{
            saldo -= var;
        }
    }
    
    public void depositar(float var){
        if(var>0){
        saldo += var;
        }
        else 
        {
            System.out.println("==========Erro=========="); 
            System.out.println("Não é possível depositar um valor negativo");
            
        }
    }
   
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
        
}