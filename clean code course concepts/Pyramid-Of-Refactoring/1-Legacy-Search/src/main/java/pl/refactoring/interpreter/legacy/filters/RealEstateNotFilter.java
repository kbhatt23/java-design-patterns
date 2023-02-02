package pl.refactoring.interpreter.legacy.filters;

import pl.refactoring.interpreter.legacy.RealEstate;

public class RealEstateNotFilter implements RealEstateFilter {

	private RealEstateFilter filter;


	public RealEstateNotFilter(RealEstateFilter filter) {
		this.filter = filter;
	}

	@Override
	public boolean filter(RealEstate realEstate) {
		return !filter.filter(realEstate);
	}

}
