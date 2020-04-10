package selfExample.goodway;

import java.util.ArrayList;
import java.util.List;

public class IteratorSeperate {
public static void main(String[] args) {
	List<Element> allItems  = new ArrayList<Element>();
	
	allItems.add(new Item1());
	allItems.add(new Item2());
	allItems.add(new Item3());
	allItems.add(new Item4());
	for(Element entry : allItems) {
		entry.accecpt(new Item1Visitor());
		}
}
}
