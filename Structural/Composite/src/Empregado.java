
//Component
public abstract class Empregado {
         
    protected String nome;
    protected double salario;
     
    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
 
    //Exibe detalhes do empregado
    public abstract void print();
     
    public abstract void add(Empregado e);
    public abstract void remove(Empregado e);
}