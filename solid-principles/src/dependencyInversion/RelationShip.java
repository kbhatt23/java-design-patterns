package dependencyInversion;

public class RelationShip {

	private Person person;
	public RelationShip(Person person, Person relative, RelationShipType type) {
		this.person = person;
		this.relative = relative;
		this.type = type;
	}
	private Person relative;
	private RelationShipType type;
	public Person getPerson() {
		return person;
	}
	public Person getRelative() {
		return relative;
	}
	public RelationShipType getType() {
		return type;
	}
	
}
