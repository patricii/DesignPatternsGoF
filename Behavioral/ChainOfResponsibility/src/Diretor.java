
//ConcreteHandler
public class Diretor extends TomadorDeDecisao {

	public void aprova(Compra compra) {
		if (compra.getValor() < 10000F) {
			System.out.println("Compra aprovada pelo Diretor.");
		}

		else if (sucessor != null) {
			sucessor.aprova(compra);
		}
	}
}
