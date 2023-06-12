
import java.util.Calendar;

//Fábrica
public abstract class Empresa {
	
	public abstract Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida);
	
}
