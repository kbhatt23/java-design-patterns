package animalexample;

public class AnimalTaskClient {
	public static void main(String[] args) {
		IAnimal dog = new DogVisitable("shippu");
		IAnimal cat = new CatVisitable("dhekan");
		
		AnimalVisitor makeSoundVisitor = new MakeSoundVisitor();
		AnimalVisitor moveTaskVisitor = new MoveTaskVissitor();
		
		dog.acceptTask(makeSoundVisitor);
		cat.acceptTask(makeSoundVisitor);
		
		System.out.println();
		dog.acceptTask(moveTaskVisitor);
		cat.acceptTask(moveTaskVisitor);
	}
}
