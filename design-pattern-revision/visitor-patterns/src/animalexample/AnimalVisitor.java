package animalexample;

public interface AnimalVisitor {

	void visitTask(DogVisitable dog);
	
	void visitTask(CatVisitable cat);
}
