package animalexample;


//amny new functioality need change in interface and all subclasses
//whihc breaks open closed princinple
public class CatVisitable implements IAnimal
{
	private String name;

	public CatVisitable(String name) {
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
