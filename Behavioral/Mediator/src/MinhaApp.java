
public class MinhaApp {

	public static void main(String[] args) {
		//Cria-se o objeto mediador
		ChatMediator salaChat = new ChatMediator();
		
		//Criam-se os objetos participantes
		Participante joao = new ParticipanteImpl("João", salaChat);
		Participante maria = new ParticipanteImpl("Maria", salaChat);
		Participante carlos = new ParticipanteImpl("Carlos", salaChat);
		Participante renato = new ParticipanteImpl("Renato", salaChat);
		
		//Registra todos os participantes na sala de chat
		salaChat.registraParticipante(joao);
		salaChat.registraParticipante(maria);
		salaChat.registraParticipante(carlos);
		salaChat.registraParticipante(renato);
		
		//Inicia a conversa entre os participantes
		joao.enviaMensagem("Maria", "Olá Maria, tudo bem ?");
		
		maria.enviaMensagem("João", "Oi tudo! E com você ?");
		
		carlos.enviaMensagem("Renato", "Renato, você é um @!xxx.");
		
		joao.enviaMensagem("Maria", "Você está no trabalho agora ?");
	}

}
