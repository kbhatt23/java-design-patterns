package pl.refactoring.interpreter.legacy.filters;

import pl.refactoring.interpreter.legacy.RealEstate;

public class RealEstateAreaFilter implements RealEstateFilter{

	private float criteriaArea;
	
	public RealEstateAreaFilter(float criteriaArea) {
		this.criteriaArea = criteriaArea;
	}

	@Override
	public boolean filter(RealEstate realEstate) {
		return realEstate.getBuildingArea() < this.criteriaArea;
	}

}
