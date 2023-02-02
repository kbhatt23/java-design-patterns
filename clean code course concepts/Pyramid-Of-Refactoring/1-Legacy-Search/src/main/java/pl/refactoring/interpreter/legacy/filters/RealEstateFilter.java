package pl.refactoring.interpreter.legacy.filters;

import pl.refactoring.interpreter.legacy.RealEstate;

@FunctionalInterface
public interface RealEstateFilter {

	public boolean filter(RealEstate realEstate);
}
