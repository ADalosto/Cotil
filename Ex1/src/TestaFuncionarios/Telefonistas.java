/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestaFuncionarios;

public class Telefonistas extends Funcionarios {
  
private int codigoEstTrab;

    public Telefonistas (String nome, float salario, int codigo, String funcao){
        super(nome, salario, funcao);
        this.codigoEstTrab = codigo;
    }

    @Override
    public void mostraDados(){
        System.out.println("Nome: "+ getNome()+" Salario: R$"+ getSalario());
        System.out.println("Código: "+ getCodigoEstTrab());
        System.out.println("Função: "+getFuncao());
        System.out.println("--------------------------------------------------------");
    }

    public int getCodigoEstTrab() {
        return codigoEstTrab;
    }

    public void setCodigoEstTrab(int codigoEstTrab) {
        this.codigoEstTrab = codigoEstTrab;
    }
}