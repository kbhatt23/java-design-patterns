package exapmple1;

public class AbstractFactoryClient {
public static void main(String[] args) {
	//hiding type
	AnimalFactoryCreator creator = AnimalFactoryCreator.createCreator(
			AnimalFactoryCreator.CREATOR_TYPE_PET
			);
	Animal animal = null;
	animal = AnimalFactory.createAnimal(creator, PetCreator.ANIMAL_TYPE_CAT);
	
	animal.makeSound();
	
	animal = AnimalFactory.createAnimal(creator, PetCreator.ANIMAL_TYPE_DOG);
	
	animal.makeSound();
	
	creator = AnimalFactoryCreator.createCreator(AnimalFactoryCreator.CREATOR_TYPE_WILD);
	animal = AnimalFactory.createAnimal(creator, WildAnimalCreator.ANIMAL_TYPE_ELEPHANT);
	
	animal.makeSound();
	
	animal = AnimalFactory.createAnimal(creator, WildAnimalCreator.ANIMAL_TYPE_LION);
	
	animal.makeSound();
}

}
