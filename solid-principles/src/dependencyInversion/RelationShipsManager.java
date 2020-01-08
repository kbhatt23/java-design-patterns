package dependencyInversion;

import java.util.ArrayList;
import java.util.List;

//low level module
public class RelationShipsManager {
	private List<RelationShip> relationshipEntries = new ArrayList<RelationShip>();

	public List<RelationShip> getRelationshipEntries() {
		return relationshipEntries;
	}


	public void addChildRelationship(Person parent , Person child) {
		relationshipEntries.add(new RelationShip(parent, child, RelationShipType.PARENT));
		
		relationshipEntries.add(new RelationShip(child, parent, RelationShipType.CHILD));
		
	}
}
