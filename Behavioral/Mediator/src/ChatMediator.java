import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

//Sala de chat
public class ChatMediator extends Mediator {

	private Hashtable<String, Participante> participantes = new Hashtable<String, Participante>();
	
	private List<String> palavrasProibidas = new ArrayList<String>();
	
	public ChatMediator() {
		//Carrega a lista de palavras proibidas na sala de chat.
		palavrasProibidas.add("xxxxx");
		palavrasProibidas.add("@!xxx");
		palavrasProibidas.add("###@!");
	}
	
	public void registraParticipante(Participante p) {
		//Verifica se não existem dois participantes com o mesmo apelido na sala de chat.
		if(!participantes.containsKey(p.getNome())){
			participantes.put(p.getNome(), p);
		}
		else{
			System.out.println("Usuário já cadastrado.");
		}
	}
	
	public void enviaMensagem(String remetente, String destinatario, String mensagem) {
		//Verifica se o remetente e o destinatario estão na sala de chat.
		if(participantes.containsKey(remetente) && participantes.containsKey(destinatario)){
			//Obtém o usuário remetente
			Participante pRemetente = participantes.get(remetente);
			//Obtém o usuário destinatário
			Participante pDestinatario = participantes.get(destinatario);
			
			//Verifica se a mensagem contém palavras proibidas.
			for(String proibido : palavrasProibidas){
				if(mensagem.contains(proibido)){
					pRemetente.recebeMensagem("Mediador", "Você escreveu uma mensagem contendo palavras impróprias.");
					return;
				}
			}
			
			//Se não há palavras proibidas na mensagem, então ela é enviada ao destinatário
			pDestinatario.recebeMensagem(remetente, mensagem);
		}
	}

}
