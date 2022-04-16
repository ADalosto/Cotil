/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean3;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Bean3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nome;
    float salario,vendas,porcentagem,total ;
    Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o nome do vendedor: ");
        nome = teclado.nextLine();
        System.out.println("Digite o salario fixo: ");
        salario = teclado.nextFloat();
        System.out.println("Digite a quantidade de vendas no mês em dinheiro: ");
        vendas = teclado.nextFloat();
        porcentagem = (float) (vendas*0.15);
                total = porcentagem + salario;
        System.out.println("Nome: " + nome + " total no mes: " + total);
        
       
    }
    
}
