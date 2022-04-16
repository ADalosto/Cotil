
package TestaFuncionarios;

public class TestaFuncionarios {

    public static void main(String[] args) {
  Gerentes g1 = new Gerentes("Gabriel", 2000f, "Biel", 123456,"Gerente");
  Secretarias s1 = new Secretarias ("Sonia", 1000f,50051,"Secretaria");
  Telefonistas t1 = new Telefonistas("Simone",800f,055,"Telefonista");    
        System.out.println("-------------------------Gerentes-------------------------");
        System.out.println("Gerente: "+g1.getNome()+" R$"+ g1.getSalario() + " Usuario: "+ g1.getUsuario() + " Senha:" + g1.getSenha());
        System.out.println("O salario de "+ g1.getNome()+" Com a bonificação ficará R$"+ (g1.getSalario()+ g1.calculaBonificacao()));
        System.out.println("-------------------------Telefonistas-------------------------");
        System.out.println("Telefonista: "+t1.getNome()+" R$"+ t1.getSalario() +" Código Da Estaçao de Trabalho: "+ t1.getCodigoEstTrab());
        System.out.println("O salario de "+ t1.getNome() +" Com a bonificação ficará R$"+ (t1.getSalario()+ t1.calculaBonificacao()));
        System.out.println("-------------------------Secretárias-------------------------");
        System.out.println("Secretária: "+s1.getNome()+" R$"+ s1.getSalario() +" Ramal: "+ s1.getNumeroRamal());
        System.out.println("O salario de "+ s1.getNome() +" Com a bonificação ficará R$"+ (s1.getSalario()+ s1.calculaBonificacao()));
        System.out.println("-------------------------Dados--------------------------");
        g1.mostraDados();
        t1.mostraDados();
        s1.mostraDados();
    }
}