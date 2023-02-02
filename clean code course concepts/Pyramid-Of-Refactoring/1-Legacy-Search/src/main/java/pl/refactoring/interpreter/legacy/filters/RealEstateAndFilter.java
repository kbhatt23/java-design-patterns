package pl.refactoring.interpreter.legacy.filters;

import pl.refactoring.interpreter.legacy.RealEstate;

public class RealEstateAndFilter implements RealEstateFilter {

	private RealEstateFilter filterOne;

	private RealEstateFilter filterTwo;

	public RealEstateAndFilter(RealEstateFilter filterOne, RealEstateFilter filterTwo) {
		this.filterOne = filterOne;
		this.filterTwo = filterTwo;
	}

	@Override
	public boolean filter(RealEstate realEstate) {
		return filterOne.filter(realEstate) && filterTwo.filter(realEstate);
	}

}
