
package projetopetshop;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoPetShop {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
     ArrayList <Cliente> cliente = new ArrayList ();
     boolean rodando = true;
     
     while(rodando){
         
        System.out.println("|1| Cadastrar Cliente");
        System.out.println("|2| Listar Clientes Cadastrados");
        System.out.println("|3| Buscar Cliente Por Nome");
        System.out.println("|4| Produtos");
        System.out.println("|5| Sair");
        System.out.println("Digite a Opção: ");
        String opcao=scan.nextLine();
   switch(opcao){
       
       case "1": 
       {
           System.out.println("=============Cadastro De Clientes=============");
           System.out.println("Digite Seu Nome: ");
           String nome = scan.nextLine();
           System.out.println("Digite Seu Email: ");
            String email = scan.nextLine();
           System.out.println("Digite Seu Cpf: ");
            int cpf = scan.nextInt();
            System.out.println("Digite Sua Idade: ");
            int idade = scan.nextInt();
            System.out.println("Digite Seu Telefone: ");
            int tel = scan.nextInt();
           Cliente c=new Cliente();
           c.setNome(nome);
           c.setCpf(cpf);
           c.setIdade(idade);
           c.setEmail(email);
           c.setTelefone(tel);
           
           cliente.add(c);
           break;
       }
        case "2": 
       {
           System.out.println("=============Lista De Clientes=============");
           for(int i = 0; i <cliente.size(); i++){
          
               System.out.println("Cliente " + i);
               System.out.println("\tNome: " + cliente.get(i).getNome());
               System.out.println("\tEmail: " + cliente.get(i).getEmail());
               System.out.println("\tCpf: " + cliente.get(i).getCpf());
               System.out.println("\tIdade: " + cliente.get(i).getIdade() );
                System.out.println("\tTelefone: " + cliente.get(i).getTelefone());
           }
           break;
       }
         case "3": 
       {
           System.out.println("=============Buscar Clientes=============");
           System.out.println("Digite o nome: ");
           String nome = scan.nextLine();
           
           for (int i = 0 ; i <cliente.size(); i++){
           Cliente cTemp= cliente.get(i);
           
           if(nome.equals(cTemp.getNome())){
               System.out.println("Clientes Encontrados");   
               System.out.println("\tCliente: " + cTemp.getNome());
               break;
           }else{
               System.out.println("Cliente Não Encontrado");   
           }
           
           
               }
           
           break;
       }
         case "4": 
       {
           
           break;
       }
         case "5": 
       {
           rodando=false;
           break;
       }
   }
   
    }}}
    
   
    
 
 
