package com.shivam.zoo1;

public class Mammal {
//	Member Variable
	private int energyLevel = 100;
//	constructor method
	public Mammal() {
		this.energyLevel = 100;
	}
//	overriding method
	public void Mammal(int num) {
		this.energyLevel = num;
	}
//	Getter and Setter
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
//	class methods
	public int displayEnergy() {
		return this.energyLevel;
	}
}

	
