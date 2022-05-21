
package exerciciothrow1;

public class ExercicioThrow1 {

 
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
         try
         {
        a1.setNome("");
         }
         catch(StringVazioException e)
                 {
        System.out.println(e.getMessage());
                 }
        try
        {    
        a1.setRa(-1);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        //System.out.println(a1.getRa());
    }
    
}
