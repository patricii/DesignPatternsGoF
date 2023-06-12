
public class Memento {

	private String nome = "";
	private float totalVendas = 0.0F;
	
	public Memento(String nome, float totalVendas){
		this.nome = nome;
		this.totalVendas = totalVendas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(float totalVendas) {
		this.totalVendas = totalVendas;
	}
}
