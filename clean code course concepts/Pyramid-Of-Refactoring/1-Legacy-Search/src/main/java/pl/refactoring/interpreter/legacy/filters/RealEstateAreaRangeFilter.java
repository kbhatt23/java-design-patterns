package pl.refactoring.interpreter.legacy.filters;

import pl.refactoring.interpreter.legacy.RealEstate;

public class RealEstateAreaRangeFilter implements RealEstateFilter {

	private float minArea;
	private float maxArea;

	public RealEstateAreaRangeFilter(float minArea, float maxArea) {
		this.minArea = minArea;
		this.maxArea = maxArea;
	}

	@Override
	public boolean filter(RealEstate realEstate) {
		float buildingArea = realEstate.getBuildingArea();
		return buildingArea >= minArea && buildingArea <= maxArea;
	}

}
