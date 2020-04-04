package example2;

public class AbstractFactoryClient2 {

	public static void main(String[] args) {

		FactoryComplete animalFactory = FactoryComplete.createAbstractFactory(
				FactoryComplete.FACTORY_TYPE_ANIMAL
				);
		Animal cat = animalFactory.getAnimal(FactoryComplete.ANIMAL_TYPE_CAT);
		cat.makeSound();
		
		FactoryComplete birdFactory = FactoryComplete.createAbstractFactory(
				FactoryComplete.FACTORY_TYPE_BIRD
				);
		Bird pigeon = birdFactory.getBird(FactoryComplete.BIRD_TYPE_PIGEON);
		pigeon.makeSound();
	}

}
