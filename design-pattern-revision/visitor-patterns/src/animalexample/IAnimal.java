package animalexample;

public interface IAnimal {
	//hopeyfully all animal can do these below things
//	public void makeSound(AnimalVisitor visitor);
//	
//	public void move(AnimalVisitor visitor);
//	
//	public void eat(AnimalVisitor visitor);
	
	//same method handles all task based on visitor passed
	public void acceptTask(AnimalVisitor visitor);
	
	public String getName();

}
