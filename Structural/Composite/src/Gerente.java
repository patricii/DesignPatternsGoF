import java.util.ArrayList;
import java.util.List;


//Composite
public class Gerente extends Empregado {
  
    //Collection of child graphics.
    private List<Empregado> listaSubordinados = new ArrayList<Empregado>();
  
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
     
    //Exibe a estrutura 
    public void print() {
        System.out.println(super.nome + ", $" + super.salario);
        for (Empregado e : listaSubordinados) {
            e.print();
        }
    }
  
    //Adiciona empregado à estrutura.
    public void add(Empregado e) {
        listaSubordinados.add(e);
    }
  
    //Remove empregado da estrutura.
    public void remove(Empregado e) {
        listaSubordinados.remove(e);
    }
}