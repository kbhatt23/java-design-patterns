package animalexample;

public class DogVisitable implements IAnimal{

	private String name;

	public DogVisitable(String name) {
		this.name = name;
	}

		
	@Override
	public String getName() {
		return name;
	}


	@Override
	public void acceptTask(AnimalVisitor visitor) {
		visitor.visitTask(this);
	}

}
