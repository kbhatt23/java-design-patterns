package openClosePrinciple.lambdaWay;

import java.util.List;
import java.util.function.Predicate;

public interface FilterUsingLambda<T> {

	public List<T> filter(List<T> items, Predicate<T> criteria);
}
