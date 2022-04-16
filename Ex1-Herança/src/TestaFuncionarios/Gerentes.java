package TestaFuncionarios;
/**
 *
 * @author Andrey Dalosto
 */
public class Gerentes extends Funcionarios {
    private String usuario;
    private int senha;

public Gerentes(String nome,float salario,String usuario,int senha,String funcao){
super (nome, salario, funcao);
this.usuario=usuario;
this.senha=senha;
}
    @Override
    public float calculaBonificacao(){
        float bonus;
        bonus = this.getSalario()*0.15f;
        return bonus;
    }
    
    @Override
    public void mostraDados(){
        System.out.println("Nome: "+ getNome()+" Salario: R$"+ getSalario());
        System.out.println("Username: "+ getUsuario()+ " Senha: "+ getSenha());
        System.out.println("Funcao: "+ getFuncao());
        System.out.println("--------------------------------------------------------");
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}