package testandometodos;

/**
 *
 * @author Andrey Dalosto
 */
public class TestandoMetodos {

    public static void main(String[] args) {
    String str1 = new String("tania");
    String str2 = new String();
    str2 = str1.toUpperCase();
        System.out.println(str2);
        
      //1 - verificar se string começa com "ma"
      String str3 = new String("machado");
      if(str3.startsWith("ma"))
      {
          System.out.println("começa com ma");
      }
     
      
                  
      //2 - verificar qual caractere esta na posiçao 
      
       String posicao = new String (str3);

        System.out.println("o caractere da 1° letra  " +posicao.charAt(0)); 
        System.out.println("o caractere da 2° letra " +posicao.charAt(1));
        System.out.println("o caractere da 4° letra  " +posicao.charAt(3));
        System.out.println("o caractere da 5° letra " +posicao.charAt(4));     
 
        
 
      
      //  4 de uma string
      //3 - concatenar duas strings
      
     String concateada = str1.concat(str1);
        System.out.println(concateada);
     
      
      
      //4 - verificar se duas strings sao iguais 
      String str5= new String("Ivan");
            String str6= new String("Ian");
            boolean ehigual = str5.equals(str6);
            System.out.println(ehigual);

              
    }
    
}