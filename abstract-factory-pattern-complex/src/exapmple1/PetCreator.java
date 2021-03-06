package exapmple1;


public class PetCreator implements AnimalFactoryCreator{

	
	public static final String ANIMAL_TYPE_CAT = "cat";
	public static final String ANIMAL_TYPE_DOG = "dog";
	@Override
	public  Animal createAnimal(String type)
	{
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

}
