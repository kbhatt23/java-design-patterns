package example2;

public interface FactoryComplete {
	public static final String ANIMAL_TYPE_CAT = "cat";
	public static final String ANIMAL_TYPE_DOG = "dog";
	public static final String BIRD_TYPE_CROW = "crow";
	public static final String BIRD_TYPE_PIGEON = "pigeon";
	public static final String FACTORY_TYPE_ANIMAL = "animal";
	public static final String FACTORY_TYPE_BIRD = "bird";
	Animal getAnimal(String type);
	
	Bird getBird(String type);
	
	static FactoryComplete createAbstractFactory(String type) {
		FactoryComplete item = null;
		switch (type) {
		case FACTORY_TYPE_ANIMAL:
			item = new AnimalFactory();
			break;
		case FACTORY_TYPE_BIRD:
			item = new BirdFactory();
			break;
		default:
			throw new UnsupportedOperationException("unkown type of factory "+type);
		}
		return item;
	}

}
