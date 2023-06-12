
public class MinhaApp {

	public static void main(String[] args) {
		//Criar objeto zoo
		Zoo zoo = new ZooImpl();
		
		//Adiciona animais ao zoológico
		zoo.addAnimal(new Animal("tigre", "mamifero"));
		zoo.addAnimal(new Animal("pinguim", "ave"));
		zoo.addAnimal(new Animal("jacaré", "reptil"));
		zoo.addAnimal(new Animal("leão", "mamifero"));
		zoo.addAnimal(new Animal("elefante", "mamifero"));
		
		AveIterator it = new AveIterator(zoo);
		
		while(it.hasNext()){
			System.out.println(it.next().getNome());
		}
	}

}
