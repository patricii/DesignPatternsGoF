
//Leaf
public class Programador extends Empregado {
  
    public Programador(String nome, double salario) {
        super(nome, salario);
    }
 
    //Exibe detalhes do empregado
    public void print() {
        System.out.println(super.nome + ", $" + super.salario);
    }
     
    //Adiciona empregado à estrutura.
    public void add(Empregado e) {
        System.out.println("Não é possível adicionar empregado subordinado do programador");
    }
  
    //Remove empregado da estrutura.
    public void remove(Empregado e) {
        System.out.println("Não é possível remover empregado subordinado do programador");
    }
}