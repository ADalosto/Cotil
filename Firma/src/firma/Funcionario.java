package firma;
/**
 *
 * @author Andrey Dalosto
 */
public class Funcionario {
private String nome, sobrenome;
    private double salario;
    private double salarioAno;
   
    Funcionario (String nome, String sobrenome, double salario, double salarioAno){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.salario=salario;
        this.salarioAno=salarioAno;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
   
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if(salario>0){
        this.salario = salario;}
        else{System.out.println("Salário negativo, não configurado!");}
    }

    public double getSalarioAno (){
        this.salarioAno = (salario *12);
    return salarioAno;
}
     public void setSalarioAno(double salarioAno) {
         this.salarioAno = salarioAno;
  }
}
