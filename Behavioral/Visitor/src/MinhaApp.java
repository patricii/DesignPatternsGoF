
public class MinhaApp {

	public static void main(String[] args) {

		//ObjectStructure
		Loja loja = new Loja();
				
		//Visitor
		PrecoEquipamentoVisitor visitor = new PrecoEquipamentoVisitor();
				
		//Element
		loja.addEquipamento(new Geladeira("Geladeira ABC", 1000.0));
		loja.addEquipamento(new Geladeira("Geladeira Duplex XYZ", 2500.0));
		loja.addEquipamento(new TV("TV LED 58 pol. ZZZ", 4000.0));
		loja.addEquipamento(new Fogao("Fogão 6 bocas branco ABC", 1500.0));
				
		//Visita todos os elementos
		for(Equipamento e : loja.getEquipamentoList()){
			e.accept(visitor);
		}
	}
}
