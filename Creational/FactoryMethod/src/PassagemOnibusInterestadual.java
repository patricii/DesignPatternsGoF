
import java.util.Calendar;

//Produto concreto
public class PassagemOnibusInterestadual extends Passagem {

	public PassagemOnibusInterestadual(String origem, String destino, Calendar dataHoraPartida) {
		
		super(origem, destino, dataHoraPartida);
	}

	public void exibeDetalhes() {
		
		System.out.println("Passagem de ônibus interestadual: " + this.getOrigem() + 
				" para " + this.getDestino() + 
				", Data/Hora: " + super.df.format(this.getDataHoraPartida().getTime()));
	}

}
