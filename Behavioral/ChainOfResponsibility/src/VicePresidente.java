
//ConcreteHandler
public class VicePresidente extends TomadorDeDecisao {

	public void aprova(Compra compra) {
		if (compra.getValor() < 30000F) {
			System.out.println("Compra aprovada pelo Vice-Presidente.");
		}

		else if (sucessor != null) {
			sucessor.aprova(compra);
		}
	}
}
