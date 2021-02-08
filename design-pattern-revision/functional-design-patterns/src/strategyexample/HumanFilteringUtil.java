package strategyexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HumanFilteringUtil {

	//in strategy we need to create so many classes
	//lambda way is great , extremely flexible
	//any new filter wont require change in this calss/methods
	public static List<Human> filterHuman(List<Human> humans, Predicate<Human> filter){
		List<Human> filteredChain  = new ArrayList<>() 
				;
		for(Human h : humans) {
			if(filter.test(h)) {
				filteredChain.add(h);
			}
		}
		return filteredChain;
	}
	
	public List<Human> filterHumanStream(List<Human> humans, Predicate<Human> filter){
		return humans.stream().filter(filter).collect(Collectors.toList());
	}
}
