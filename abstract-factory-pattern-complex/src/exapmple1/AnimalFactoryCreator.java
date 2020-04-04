package exapmple1;


public interface AnimalFactoryCreator {
	public static final String CREATOR_TYPE_WILD = "wild";
	public static final String CREATOR_TYPE_PET = "pet";
	Animal createAnimal(String type);
	
	static AnimalFactoryCreator createCreator(String type) {

		AnimalFactoryCreator creator =null;
		switch (type) {
		case CREATOR_TYPE_WILD:
			creator = new WildAnimalCreator();
			break;
		case CREATOR_TYPE_PET:
			creator = new PetCreator();
			break;	

		default:
			throw new RuntimeException("creator type not supported with name "+type);
		}
		return creator;
	
	}
		
}
