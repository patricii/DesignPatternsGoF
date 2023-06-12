
public abstract class Participante {
	
	private String nome;
	private Mediator mediador;
	
	public Participante(String nome, Mediator mediador){
		this.nome = nome;
		this.mediador = mediador;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Mediator getMediador() {
		return mediador;
	}

	public void setMediador(Mediator mediador) {
		this.mediador = mediador;
	}
	
	public abstract void enviaMensagem(String destinatario, String mensagem);
	
	public abstract void recebeMensagem(String remetente, String mensagem);

}