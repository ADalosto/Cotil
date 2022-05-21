
package exerciciothrow1;

public class Aluno {
    private int ra;
    private String nome;
    
    
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        if(ra<0)
        {
            throw new IllegalArgumentException("ra deve ser positivo");
        }
        else
        {
             this.ra = ra;
        }
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.equals(""))
        {
            throw new StringVazioException();
        }
        else
        {
        this.nome = nome;
    }
    }
}
