package exemploheranca;

/**
 *
 * @author Andrey Dalosto
 */
    public class ExHeranca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Cleber", 66);
            //p1.setNome("Gilberto"); > ja inserido como instancia em p1
            //p1.setIdade(64); > ja inserido como instancia em p1
        System.out.println("Nome: "+ p1.getNome() +" | Idade: "+ p1.getIdade());
        p1.mostra();
        
        //mesmo a classe Aluno tendo apeans 1 atributo ela está extendendo atributos da classe Pessoa 
        Aluno al1 = new Aluno("Paulo", 16, 2021);
            //al1.setNome("Jubiuscleusa"); > ja inserido como instancia em al1
            //al1.setIdade(17); > ja inserido como instancia em al1
        System.out.println("Nome: "+ al1.getNome() +" | Idade: "+ al1.getIdade() + " | RA: "+ al1.getRa());
            //al1.setRa(1234); > ja inserido como instancia em al1
        al1.mostra();
        
        //mesmo a classe Professor estando com apenas 1 atributo ela está extendendo atributos tambem da classe Pessoa
        Professor prof1 = new Professor("Gilson", 38, 6927);
            //prof1.setNome("Adamastor"); > ja inserido como instancia em prof1
            //prof1.setIdade(69); > ja inserido como instancia em prof1
            //prof1.setSalario(4700); > ja inserido como instancia em prof1
        System.out.println("Nome: "+ prof1.getNome()+" | Idade: "+ prof1.getIdade() + " | Salario: R$"+ prof1.getSalario());
        prof1.mostra();
        
        Bolsista bol1 = new Bolsista("Muriel", 17, 2022, 960);
        System.out.println("Nome: "+ bol1.getNome() +" | Idade: "+ bol1.getIdade() +" | RA: "+ bol1.getRa()+ " | Bolsa: R$"+ bol1.getBolsa());
        bol1.mostra();
        
    }
    
}