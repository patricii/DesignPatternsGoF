
public class FishBuilder extends SanduicheBuilder{

	private Sanduiche s = new Fishburguer(); 
	
	public void abrePao() {
		System.out.println("Abre pão de fishburguer.");
	}

	public void insereIngredientes() {
		System.out.println("Insere filé de peixe.");
	}

	public void fechaPao() {
		System.out.println("Fecha pão de fishburguer.");
	}

	public Sanduiche getSanduiche() {
		System.out.println("Fishburguer está pronto !");
		return s;
	}
}
