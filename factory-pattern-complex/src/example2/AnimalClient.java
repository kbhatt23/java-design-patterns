package example2;

public class AnimalClient {

	public static void main(String[] args) {
		Animal animal = AnimalFactory.createAnima(AnimalFactory.ANIMAL_TYPE_CAT);
		animal.makeSound();
		
		 animal = AnimalFactory.createAnima(AnimalFactory.ANIMAL_TYPE_DOG);
		animal.makeSound();
	}

}
