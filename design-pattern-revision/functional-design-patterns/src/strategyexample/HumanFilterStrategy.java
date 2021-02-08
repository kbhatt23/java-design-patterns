package strategyexample;

import java.util.List;
import java.util.function.Predicate;

public class HumanFilterStrategy {
public static void main(String[] args) {
	List<Human> createHumans = Human.createHumans(); 
	
	Predicate<Human> greaterThan40 = h -> h.getAge() > 40;
	
	Predicate<Human> onlyIndian = h -> h.getCountry().equals("India");
	
	List<Human> filterHuman = HumanFilteringUtil.filterHuman(createHumans, greaterThan40.and(onlyIndian));
	System.out.println(createHumans);
	System.out.println(filterHuman);
}
}
