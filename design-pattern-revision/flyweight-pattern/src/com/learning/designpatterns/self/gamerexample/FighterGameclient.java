package com.learning.designpatterns.self.gamerexample;

import java.util.Random;

import com.learning.designpatterns.self.gamerexample.GameFighter.FighterCategory;

public class FighterGameclient {

	private static FighterCategory[] categories = new FighterCategory[] { FighterCategory.ARMY,
			FighterCategory.TERROIST };
	private static Random random = new Random();

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			FighterCategory category = findRandomCategory();
			GameFighter fighter = FighterGameFactory.findFighter(category);
			// update extrinstic properties
			fighter.updateName("figter:" + i);
			fighter.updateWeapons(i + 1);
			
			System.out.println("hashcode of fighter is "+fighter.hashCode());
			fighter.fight();
		}

	}

	private static FighterCategory findRandomCategory() {
		int randomIndex = random.nextInt(categories.length);
		return categories[randomIndex];

	}
}
