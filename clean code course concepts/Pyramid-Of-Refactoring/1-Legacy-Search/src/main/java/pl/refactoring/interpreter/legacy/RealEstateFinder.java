package pl.refactoring.interpreter.legacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import pl.refactoring.interpreter.legacy.filters.RealEstateAndFilter;
import pl.refactoring.interpreter.legacy.filters.RealEstateAreaFilter;
import pl.refactoring.interpreter.legacy.filters.RealEstateAreaRangeFilter;
import pl.refactoring.interpreter.legacy.filters.RealEstateEstateMaterialAndAreaFilter;
import pl.refactoring.interpreter.legacy.filters.RealEstateEstateMaterialFilter;
import pl.refactoring.interpreter.legacy.filters.RealEstateEstatePlacementFilter;
import pl.refactoring.interpreter.legacy.filters.RealEstateFilter;
import pl.refactoring.interpreter.legacy.filters.RealEstateNotFilter;
import pl.refactoring.interpreter.legacy.filters.RealEstateTypeFilter;

/**
 * Copyright (c) 2020 IT Train Wlodzimierz Krakowski (www.refactoring.pl)
 * Sources are available only for personal usage by Udemy students of this course.
 */
public class RealEstateFinder {
    private List<RealEstate> repository;

    public RealEstateFinder(List<RealEstate> repository) {
        this.repository = repository;
    }

    public List<RealEstate> byBelowArea(float maxBuildingArea){
    	
    	//after checks
    	RealEstateFilter areaFilter = new RealEstateAreaFilter(maxBuildingArea);
    	return findByFilterCriteria(areaFilter);
    }
    
    private List<RealEstate> findByFilterCriteria(RealEstateFilter realEstateFilter){
    	 return repository.stream()
    	           .filter(realEstateFilter :: filter)
    	           .collect(Collectors.toList());
    }
    
    public List<RealEstate> byMaterial(EstateMaterial material){
    	RealEstateFilter materialFilter = new RealEstateEstateMaterialFilter(material);
    	return findByFilterCriteria(materialFilter);
    }

    public List<RealEstate> byMaterialBelowArea(EstateMaterial material, float maxBuildingArea){
    	//below is ok but it is nt following DRY principle: code is redundant
    	//so ni future logic changes dev might forget it
    	//RealEstateFilter filter = new RealEstateEstateMaterialAndAreaFilter(material, maxBuildingArea);
    	
    	//better use like below
    	RealEstateFilter filter = new RealEstateAndFilter(new RealEstateEstateMaterialFilter(material), new RealEstateAreaFilter(maxBuildingArea));
    	
    	return findByFilterCriteria(filter);
    	
    }

    public List<RealEstate> byPlacement(EstatePlacement placement){
    	return findByFilterCriteria(new RealEstateEstatePlacementFilter(placement));
    	
    }

    public List<RealEstate> byAvoidingPlacement(EstatePlacement placement){
    	RealEstateNotFilter avoidPlacementFilter = new RealEstateNotFilter(new RealEstateEstatePlacementFilter(placement));
    	return findByFilterCriteria(avoidPlacementFilter);
    }

    public List<RealEstate> byAreaRange(float minArea, float maxArea){
       return findByFilterCriteria(new RealEstateAreaRangeFilter(minArea, maxArea));
    }

    public List<RealEstate> byType(EstateType type){
        return findByFilterCriteria(new RealEstateTypeFilter(type));
    }

    public List<RealEstate> byVerySpecificCriteria(EstateType type, EstatePlacement placement, EstateMaterial material){
        RealEstateFilter realEstateTypeFilter = new RealEstateTypeFilter(type);
        RealEstateFilter realEstateEstatePlacementFilter = new RealEstateEstatePlacementFilter(placement);
        RealEstateFilter realEstateEstateMaterialFilter = new RealEstateEstateMaterialFilter(material);
        
        
        RealEstateFilter specificCriteriaFilter=  new RealEstateAndFilter(new RealEstateAndFilter(realEstateTypeFilter, realEstateEstatePlacementFilter), realEstateEstateMaterialFilter);
        
        return findByFilterCriteria(specificCriteriaFilter);
    }
}
