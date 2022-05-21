package extrycatch;

public class ExTryCatch {
public static void aumentarLetra()
{
 String palavra= "teste";   
 try
 {
    System.out.println(palavra.toUpperCase());
     System.out.println(palavra.charAt(3));
}
 catch (NullPointerException e)
 {
     System.out.println("String nula,favor inicializa-la");
 }
 catch(StringIndexOutOfBoundsException e) 
         {
             System.out.println("palavra nao tem caracteres suficientes");
         }

          finally
 {   
            System.out.println("passei por aqui");   
}
}
    public static void main(String[] args) {
     aumentarLetra();
    }
    
}
