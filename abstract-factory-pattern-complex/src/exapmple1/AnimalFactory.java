package exapmple1;

public class AnimalFactory {

	public static Animal createAnimal(AnimalFactoryCreator creator, String type) {
		return creator.createAnimal(type);
	}
}
