/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Bean2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float nota;
       String nome;
       Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o nome: ");
        nome = teclado.nextLine();
        System.out.println("Digite a nota: ");
        nota = teclado.nextFloat();
        System.out.println("Nome: " + nome + " nota: "+nota);
    }
    
}
