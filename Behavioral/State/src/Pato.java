
public class Pato extends Ave{
	
	private Comportamento comportamentoVoar;
	private Comportamento comportamentoGrasnar;
	
	public Pato(){
		comportamentoVoar = new Voar();
		comportamentoGrasnar = new Grasnar();
	}
	
	public void setComportamentoVoar(Comportamento c) {
		comportamentoVoar = c;
	}

	public void voar() {
		comportamentoVoar.exec();
	}

	public void setComportamentoGrasnar(Comportamento c) {
		comportamentoGrasnar = c;
	}

	public void grasnar() {
		comportamentoGrasnar.exec();
	}
	
}