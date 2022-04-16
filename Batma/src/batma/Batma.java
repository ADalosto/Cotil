
package batma;

public class Batma {

    
    public static void main(String[] args) {
        
        Aluno al1 = new Aluno ();
        
        al1.setNome("Tania");
        al1.setIdade(-1);
        al1.setAltura(1.66);
        
        System.out.println("Nome: " + al1.getNome());
        System.out.println("Idade: " + al1.getIdade());
        System.out.println("Altura: " + al1.getAltura());        
    }
   {   
   Professor al2 = new Professor ();
   
   al2.setNomeProf("Ian");
   al2.setMateriaProf("Filosofia");
   al2.setSigla("Fl");
   
       System.out.println("Nome do professor: " + al2.getNomeProf());
       System.out.println("Materia: " + al2.getmateriaProf());
       System.out.println("Sigla da Materia: " + al2.getSigla());   
       
           }
    {
       Disciplina al3 = new Disciplina ();
       
       al3.setNomeDisciciplina("Filosofia");
       al3.sethorarioDisciplina("13hrs");
       
       System.out.println("Disciplina: ");
       System.out.println("Horario da Aula: ");
       
   }

}