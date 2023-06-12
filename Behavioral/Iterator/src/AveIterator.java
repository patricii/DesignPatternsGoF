import java.util.Iterator;

//ConcreteIterator
public class AveIterator implements Iterator<Animal> {

	private Zoo zoo;
	private int pos = 0;
	
	public AveIterator(Zoo zoo){
		this.zoo = zoo;
	}
	
	//Metodo verifica se existe um proximo elemento especifico dessa classe na lista
	public boolean hasNext() {
		for(int i=pos; i < zoo.getAnimais().size(); i++) {
			Animal a = zoo.getAnimais().get(i);
			if(a.getClasse().equalsIgnoreCase("ave")){
				return true;
			}
		}
		return false;
	}

	//Itera��es filtradas.
	public Animal next() {
		while(pos < zoo.getAnimais().size()) {
			Animal a = zoo.getAnimais().get(pos);
			pos++;
			
			if(a.getClasse().equalsIgnoreCase("ave")){
				return a;
			}
		}
		//Retorna null se n�o ha mais elementos especificos dessa classe na lista
		return null;
	}

}
