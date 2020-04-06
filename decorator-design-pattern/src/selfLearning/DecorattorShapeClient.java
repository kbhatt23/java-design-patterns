package selfLearning;

public class DecorattorShapeClient {

	public static void main(String[] args) {
		Shape combined = new RedShape(new RectangleShape(new DefaultShape()));
		
		combined.draw();
	}

}
