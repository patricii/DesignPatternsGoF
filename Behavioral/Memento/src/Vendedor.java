
public class Vendedor {
	
	private String nome = "";
	private float totalVendas = 0.0F;
	
	public Vendedor(String nome, float totalVendas){
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
	
	public Memento createMemento() {
		Memento m = new Memento(nome, totalVendas);
		return m;
	}
	
	public void retoreMemeneto(Memento m){
		this.nome = m.getNome();
		this.totalVendas = m.getTotalVendas();
	}

}