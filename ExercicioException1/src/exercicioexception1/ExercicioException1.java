
package exercicioexception1;

public class ExercicioException1 {
  
    
    public static void main(String[] args) {
        
        Object o =null;      
        try
 {
     o.toString();
}
 catch (NullPointerException e)
 {
     System.out.println("String nula,favor inicializa-la");
 }
    }
  
}
