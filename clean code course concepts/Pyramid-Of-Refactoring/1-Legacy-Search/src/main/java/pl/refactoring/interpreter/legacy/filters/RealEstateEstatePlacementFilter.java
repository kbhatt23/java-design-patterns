package pl.refactoring.interpreter.legacy.filters;

import pl.refactoring.interpreter.legacy.EstatePlacement;
import pl.refactoring.interpreter.legacy.RealEstate;

public class RealEstateEstatePlacementFilter implements RealEstateFilter{
	
	private EstatePlacement estatePlacement;
	
	public RealEstateEstatePlacementFilter(EstatePlacement estatePlacement) {
		this.estatePlacement = estatePlacement;
	}

	@Override
	public boolean filter(RealEstate realEstate) {
		return realEstate.getPlacement().equals(this.estatePlacement);
	}

}
