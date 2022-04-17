package firma;
/**
 *
 * @author Andrey Dalosto
 */
public class Firma {

    public static void main(String args[]){
        Funcionario f1 = new Funcionario("Jota", "Pê", 2000, 150);
        Funcionario f2 = new Funcionario("Cê", "Gê", 5000, 140);
       
    System.out.println("Empregado 1: " + f1.getNome() + " " +
            f1.getSobrenome() +"\nsalario: "+ f1.getSalario() +"\nsalario anual: "+ f1.getSalarioAno()); 
 
    System.out.println("Empregado 2: " + f2.getNome() + " " +
            f2.getSobrenome() +"\nsalario: "+ f2.getSalario()+"\nsalario anual: "+ f2.getSalarioAno()); 
  
    f1.setSalario(f1.getSalario() + (f1.getSalario() * 0.10));
    f2.setSalario(f2.getSalario() + (f2.getSalario() * 0.10));
       
    System.out.println("\nCom acrécimo 10%: \n"
            + "Empregado 1: " + f1.getNome() + " " +
            f1.getSobrenome() +"\nSalário: "+ f1.getSalario());
 
    System.out.println("Empregado 2: " + f2.getNome() + " " +
           f2.getSobrenome()+"\nSalário: "+f2.getSalario());
    }

}      
    