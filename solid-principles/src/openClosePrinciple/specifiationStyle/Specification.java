package openClosePrinciple.specifiationStyle;

public interface Specification<T> {

	public boolean accept(T item);
}
