
import java.util.Calendar;

//Produto concreto
public class PassagemOnibusUrbano extends Passagem {

	public PassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida) {
		
		super(origem, destino, dataHoraPartida);
	}

	public void exibeDetalhes() {
		System.out.println("Passagem de ônibus urbana: " + this.getOrigem() + 
				" para " + this.getDestino() + 
				", Data/Hora: " + super.df.format(this.getDataHoraPartida().getTime()));
	}

}
