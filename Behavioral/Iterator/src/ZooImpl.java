import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ZooImpl extends Zoo {

	private List<Animal> animalList = new ArrayList<Animal>();
	
	public List<Animal> getAnimais() {
		return animalList;
	}

	public void addAnimal(Animal a) {
		animalList.add(a);
	}

	public void removeAnimal(Animal a) {
		animalList.remove(a);
	}

	public Iterator<Animal> createIterator() {
		return animalList.iterator();
	}

}
