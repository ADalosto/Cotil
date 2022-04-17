package exconstrutores;

/**
 *
 * @author Andrey Dalosto
 */
public class ExConstrutores {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(8002, "Pedro");
        Aluno a2 = new Aluno(8922, "amongus");
        double media = a2.calculaMedia(10, 8);       
    System.out.println("Aluno Nome: " + a2.getNome());
    System.out.println("Aluno Ra: " + a2.getRa());
    System.out.println("Media: " +media);
    System.out.println("\n-----------------------------------");
    
    double media2 = a1.calculaMedia(5.5, 2.7, 3.5);
    System.out.println("Aluno Nome: " + a1.getNome());
    System.out.println("Aluno Ra: " + a1.getRa());
    System.out.println("Media: " + media2);
    System.out.println("\n-----------------------------------");
 
  Professor a3 = new Professor("Priscila", "Matematica" , 25 )  ;
    System.out.println("Professor Nome: " + a3.getNome());       
    System.out.println("Professor Disciplina: " + a3.getDisciplina());
    System.out.println("Professor Idade: " + a3.getIdade());
} 
  
}