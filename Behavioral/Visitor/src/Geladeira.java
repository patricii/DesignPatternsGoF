
//ConcreteElement
public class Geladeira extends Equipamento {

	public Geladeira(String nome, double preco) {
		super(nome, preco);
	}

	public void accept(EquipamentoVisitor visitor) {
		visitor.visitGeladeira(this);
	}
	
}