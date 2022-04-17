package exconstrutores;

/**
 *
 * @author Andrey Dalosto
 */
public class Aluno {
private int ra;
    private String nome;
    
    public Aluno (int ra,String nome)
    {
    this.ra = ra;
    this.nome = nome;
    }
    
   public Aluno()
   {
    ra = 0;
            nome="";
   }
   public double calculaMedia(double n1, double n2)
   {
    double media = (n1+n2)/2;
    return media;
   }
   public double calculaMedia(double n1,double n2,double n3)
   {
       double media = (n1+n2+n3)/3;
       return media;
   }
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
