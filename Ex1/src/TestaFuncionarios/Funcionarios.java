package TestaFuncionarios;
/**
 *
 * @author Andrey Dalosto
 */
public class Funcionarios {
private String nome;
private float salario;
private String funcao;

public Funcionarios(String nome, float salario, String funcao){
        this.nome = nome;
        this.salario=salario;
        this.funcao=funcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }


public float calculaBonificacao(){
    float bonus;
    bonus=salario*0.10f;
    return bonus;
}
public void mostraDados(){
        System.out.println("Nome: "+ getNome()+" | Salario: R$"+ getSalario()+" | Funcao: "+ getFuncao());
    }

}
