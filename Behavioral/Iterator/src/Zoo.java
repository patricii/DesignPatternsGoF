import java.util.Iterator;
import java.util.List;


public abstract class Zoo {
	
	public abstract List<Animal> getAnimais();
	public abstract void addAnimal(Animal a);
	public abstract void removeAnimal(Animal a);
	public abstract Iterator<Animal> createIterator(); 
}
