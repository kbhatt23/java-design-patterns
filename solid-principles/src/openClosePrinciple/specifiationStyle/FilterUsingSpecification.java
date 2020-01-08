package openClosePrinciple.specifiationStyle;

import java.util.List;
//this is similiar to lambda way but in old ways predicate interface was nt there
public interface FilterUsingSpecification<T> {

	public List<T> filter(List<T> items, Specification<T> specification);
		
}
