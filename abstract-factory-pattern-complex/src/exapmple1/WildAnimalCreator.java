package exapmple1;


public class WildAnimalCreator implements AnimalFactoryCreator{

	
	public static final String ANIMAL_TYPE_LION = "lion";
	public static final String ANIMAL_TYPE_ELEPHANT = "elephant";
	@Override
	public  Animal createAnimal(String type)
	{
		Animal animal =null;
		switch (type) {
		case ANIMAL_TYPE_LION:
			animal = new Lion();
			break;
		case ANIMAL_TYPE_ELEPHANT:
			animal = new Elephant();
			break;	

		default:
			throw new RuntimeException("Animal type not supported with name "+type);
		}
		return animal;
	}

}
