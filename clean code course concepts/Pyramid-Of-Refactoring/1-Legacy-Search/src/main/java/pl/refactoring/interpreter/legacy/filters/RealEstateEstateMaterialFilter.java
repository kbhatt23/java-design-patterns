package pl.refactoring.interpreter.legacy.filters;

import pl.refactoring.interpreter.legacy.EstateMaterial;
import pl.refactoring.interpreter.legacy.RealEstate;

public class RealEstateEstateMaterialFilter implements RealEstateFilter{
	
	private EstateMaterial estateMaterial;
	
	public RealEstateEstateMaterialFilter(EstateMaterial estateMaterial) {
		this.estateMaterial = estateMaterial;
	}

	@Override
	public boolean filter(RealEstate realEstate) {
		return realEstate.getMaterial().equals(this.estateMaterial);
	}

}
