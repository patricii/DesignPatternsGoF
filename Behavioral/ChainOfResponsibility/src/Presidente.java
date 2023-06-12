
// ConcreteHandler
class Presidente extends TomadorDeDecisao {

	public void aprova(Compra compra) {
		if (compra.getValor() < 100000F) {
			System.out.println("Compra aprovada pelo Presidente.");
		}

		else {
			System.out.println("Compra não aprovada.");
		}
	}
}
