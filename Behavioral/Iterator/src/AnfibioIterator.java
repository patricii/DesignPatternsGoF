import java.util.Iterator;

//ConcreteIterator
public class AnfibioIterator implements Iterator<Animal> {

	private Zoo zoo;
	private int pos = 0;
	
	public AnfibioIterator(Zoo zoo){
		this.zoo = zoo;
	}
	
	//Metodo verifica se existe um proximo elemento especifico dessa classe na lista
	public boolean hasNext() {
		for(int i=pos; i < zoo.getAnimais().size(); i++) {
			Animal a = zoo.getAnimais().get(i);
			if(a.getClasse().equalsIgnoreCase("anfibio")){
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
			
			if(a.getClasse().equalsIgnoreCase("anfibio")){
				return a;
			}
		}
		//Retorna null se n�o ha mais elementos especificos dessa classe na lista
		return null;
	}

}
