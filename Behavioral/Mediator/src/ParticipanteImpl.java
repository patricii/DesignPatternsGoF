
public class ParticipanteImpl extends Participante {

	public ParticipanteImpl(String nome, Mediator mediador) {
		super(nome, mediador);
	}

	public void enviaMensagem(String destinatario, String mensagem) {
		Mediator mediador = this.getMediador();
		mediador.enviaMensagem(this.getNome(), destinatario, mensagem);
	}

	public void recebeMensagem(String remetente, String mensagem) {
		System.out.println(remetente + " escreveu: " + mensagem);
	}
}
