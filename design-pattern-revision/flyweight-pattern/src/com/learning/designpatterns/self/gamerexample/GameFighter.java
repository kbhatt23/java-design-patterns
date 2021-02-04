package com.learning.designpatterns.self.gamerexample;

public interface GameFighter {

	//we must put extrinsic proeprties/state that are diff for diff objects/instance
	
	void updateName(String name);
	
	//type eg terroist or army is fixed for each instance o categories and hence not needed
	void updateWeapons(int weapons);
	
	void fight();
	
	public static enum FighterCategory{
		TERROIST {
			@Override
			public GameFighter createFighter() {
				return new Terrorist();
			}
		},ARMY {
			@Override
			public GameFighter createFighter() {
				// TODO Auto-generated method stub
				return new ArmyCommando();
			}
		};
		
		public abstract GameFighter createFighter();
	}
}
