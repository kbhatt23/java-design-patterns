package pl.refactoring.interpreter.legacy.filters;

import pl.refactoring.interpreter.legacy.EstateType;
import pl.refactoring.interpreter.legacy.RealEstate;

public class RealEstateTypeFilter implements RealEstateFilter {

	private EstateType estateType;

	public RealEstateTypeFilter(EstateType estateType) {
		this.estateType = estateType;
	}

	@Override
	public boolean filter(RealEstate realEstate) {
		return realEstate.getType().equals(this.estateType);
	}

}
