package example2;

public class BirdFactory implements FactoryComplete {

	@Override
	public Animal getAnimal(String type) {
		throw new UnsupportedOperationException("animals are not applicable here");
	}

	@Override
	public Bird getBird(String type) {
		Bird bird = null;
		switch (type) {
		case BIRD_TYPE_CROW:
			bird = new Crow();
			break;
		case BIRD_TYPE_PIGEON:
			bird = new Pigeon();
			break;
		default:
			throw new UnsupportedOperationException("unkown type of brird "+type);
			}
		
		return bird;
	}

}
