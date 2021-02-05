package animalexample;

public class MoveTaskVissitor implements AnimalVisitor{

	@Override
	public void visitTask(DogVisitable dog) {
		System.out.println("Dog with name "+dog.getName()+ " moving");
	}

	@Override
	public void visitTask(CatVisitable cat) {
		System.out.println("Cat with name "+cat.getName()+ " movingnd");
	}

}
