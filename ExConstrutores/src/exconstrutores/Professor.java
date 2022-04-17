package exconstrutores;

/**
 *
 * @author Andrey Dalosto
 */
public class Professor {
private String nome,disciplina;
   private int idade;
    
   public Professor (String nome,String disciplina,int idade)
    {
    this.idade = idade;
    this.nome = nome;
    this.disciplina = disciplina;
    
    }
    
   public Professor ()
   {
    idade = 0;
            nome="";
            disciplina=""; 
            
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
   
}