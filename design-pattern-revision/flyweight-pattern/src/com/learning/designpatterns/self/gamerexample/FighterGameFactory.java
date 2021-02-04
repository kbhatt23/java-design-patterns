package com.learning.designpatterns.self.gamerexample;

import java.util.HashMap;
import java.util.Map;

import com.learning.designpatterns.self.gamerexample.GameFighter.FighterCategory;

public class FighterGameFactory {

	private static Map<FighterCategory, GameFighter> FIGHTER_MAP = new HashMap<>();
	
	public static GameFighter findFighter(FighterCategory category) {
		
		if(!FIGHTER_MAP.containsKey(category)) {
			System.out.println("Creating new Fighter with category "+category);
			FIGHTER_MAP.put(category, category.createFighter());
		}
		
		return FIGHTER_MAP.get(category);
	}
}
