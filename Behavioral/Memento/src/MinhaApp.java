
public class MinhaApp {

	public static void main(String[] args) {
		//Cria objeto vendedor
		Vendedor vendedor = new Vendedor("João", 10000.0F);
		
		System.out.println(vendedor.getNome() + " - Total de vendas: " + vendedor.getTotalVendas() + "\n");
		
		//Salva estado interno
		VendasMemory memory = new VendasMemory();
		memory.setMemento(vendedor.createMemento());
		
		//Altera os valores dos atributos do objeto vendedor
		vendedor.setNome("Pedro");
		vendedor.setTotalVendas(50000.0F);
		
		System.out.println(vendedor.getNome() + " - Total de vendas: " + vendedor.getTotalVendas() + "\n");
		
		//Restaura memento
		vendedor.retoreMemeneto(memory.getMemento());
		
		System.out.println(vendedor.getNome() + " - Total de vendas: " + vendedor.getTotalVendas() + "\n");
	}

}
