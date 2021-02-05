package animalexample;

public class MakeSoundVisitor implements AnimalVisitor{

	@Override
	public void visitTask(DogVisitable dog) {
		System.out.println("Dog with name "+dog.getName()+ " making sound");
	}

	@Override
	public void visitTask(CatVisitable cat) {
		System.out.println("Cat with name "+cat.getName()+ " making sound");
	}

}
