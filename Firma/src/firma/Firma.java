package firma;

/**
 *
 * @author Andrey Dalosto
 */
public class Firma {

    public static void main(String args[]){
        Funcionario funcionario1 = new Funcionario("Jota", "Pê", 1500, 150);
        Funcionario funcionario2 = new Funcionario("Cê", "Gê", 45000, 140);
       
    System.out.println("funcionario 1: " + funcionario1.getNome() + " " +
            funcionario1.getSobrenome() +"\nsalario: "+ funcionario1.getSalario() +"\nsalario anual: "+ funcionario1.getSalarioAno()); 
 
    System.out.println("funcionario 1: " + funcionario2.getNome() + " " +
            funcionario2.getSobrenome() +"\nsalario: "+ funcionario2.getSalario()+"\nsalario anual: "+ funcionario2.getSalarioAno()); 
  
    funcionario1.setSalario(funcionario2.getSalario() + (funcionario2.getSalario() * 0.10));
    funcionario2.setSalario(funcionario2.getSalario() + (funcionario2.getSalario() * 0.10));
       
    System.out.println("\nCom acrécimo 10%: \n"
            + "funcionario 1: " + funcionario1.getNome() + " " +
            funcionario1.getSobrenome() +"\nsalario: "+ funcionario1.getSalario());
 
    System.out.println("Empregado 1: " + funcionario2.getNome() + " " +
            funcionario2.getSobrenome() +"\nsalario: "+ funcionario2.getSalario());
    }

}      
    