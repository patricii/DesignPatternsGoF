
//ConcreteVisitor
public class PrecoEquipamentoVisitor extends EquipamentoVisitor {

	public void visitGeladeira(Geladeira geladeira) {
		System.out.println("Preço da geladeira " + geladeira.getNome() + " = $ " + String.valueOf(geladeira.getPreco()) + 
				" com +4% de impostos, total $ " + String.valueOf(geladeira.getPreco() * 1.04));
	}

	public void visitTV(TV tv) {
		System.out.println("Preço da TV " + tv.getNome() + " = $ " + String.valueOf(tv.getPreco()) + 
				" com +7% de impostos, total $ " + String.valueOf(tv.getPreco() * 1.07));
	}

	public void visitFogao(Fogao fogao) {
		System.out.println("Preço do Fogão " + fogao.getNome() + " = $ " + String.valueOf(fogao.getPreco()) + 
				" com +5% de impostos, total $ " + String.valueOf(fogao.getPreco() * 1.05));
	}
}
