package com.learning.designpatterns.self.gamerexample;

public class Terrorist implements GameFighter
{
	private String name;
	
	private int weapons;
	
	//instrinsic wont change ofr instance and hence no need to show contract for client
	private FighterCategory category;
//hardcode for all instance
	public Terrorist() {
		category = FighterCategory.TERROIST;
	}
	@Override
	public void updateName(String name) {

		this.name=name;
	}

	@Override
	public void updateWeapons(int weapons) {
		this.weapons=weapons;
	}

	@Override
	public void fight() {
		System.out.println("Fighter with name "+name+" started fightting for category "+category+" having weapons "+weapons);
	}

}
