package pl.refactoring.interpreter.legacy.filters;

import pl.refactoring.interpreter.legacy.EstateMaterial;
import pl.refactoring.interpreter.legacy.RealEstate;

public class RealEstateEstateMaterialAndAreaFilter implements RealEstateFilter{
	
	private EstateMaterial estateMaterial;
	
	private float criteriaArea;
	
	public RealEstateEstateMaterialAndAreaFilter(EstateMaterial estateMaterial,float criteriaArea) {
		this.estateMaterial = estateMaterial;
		this.criteriaArea=criteriaArea;
	}

	@Override
	public boolean filter(RealEstate realEstate) {
		//not following DRY principle
		//code is redundant
		return realEstate.getMaterial().equals(this.estateMaterial) && realEstate.getBuildingArea() < criteriaArea;
	}

}
