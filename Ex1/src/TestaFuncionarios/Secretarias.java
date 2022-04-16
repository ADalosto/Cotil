package TestaFuncionarios;
/**
 *
 * @author Andrey Dalosto
 */
public class Secretarias extends Funcionarios {
   private int numeroRamal;
      
    public Secretarias(String nome, float salario, int numeroRamal, String funcao){
        super (nome, salario, funcao);
        this.numeroRamal = numeroRamal;
    }
   
    @Override
    public void mostraDados(){
        System.out.println("Nome: "+ getNome()+" Salario: R$"+ getSalario());
        System.out.println("Ramal: "+getNumeroRamal());
        System.out.println("Função: "+getFuncao());
        System.out.println("--------------------------------------------------------");
    }

    public int getNumeroRamal() {
        return numeroRamal;
    }

    public void setNumeroRamal(int numeroRamal) {
        this.numeroRamal = numeroRamal;
    }
}