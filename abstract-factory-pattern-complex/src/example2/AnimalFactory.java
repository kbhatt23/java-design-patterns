package example2;


public class AnimalFactory implements FactoryComplete{

	@Override
	public Animal getAnimal(String type) {

		Animal animal =null;
		switch (type) {
		case ANIMAL_TYPE_CAT:
			animal = new Cat();
			break;
		case ANIMAL_TYPE_DOG:
			animal = new Dog();
			break;	

		default:
			throw new RuntimeException("Animal type not supported with name "+type);
		}
		return animal;
	}

	@Override
	public Bird getBird(String type) {
		throw new UnsupportedOperationException("birds are not applicable here");
	}

}
