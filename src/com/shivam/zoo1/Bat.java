package com.shivam.zoo1;

public class Bat extends Mammal {
	private int energyLevel;
	public Bat() {
		setEnergyLevel(300);
	}

	public void fly() {
//		setEnergyLevel(300);
		energyLevel = getEnergyLevel()-50;
		System.out.println("shuuuuukkkk..." + energyLevel);
	}
	public void eatHuman() {
		setEnergyLevel(getEnergyLevel()+25);
		System.out.println("Never Mind " + getEnergyLevel());
	}
	
//	public void attackTown() {
//		setEnergyLevel(getEnergyLevel()-100);
//		System.out.println(getEnergyLevel());
//	}
	public void attackTown() {
		setEnergyLevel(300);
		energyLevel = getEnergyLevel()-100;
		System.out.println("dhum dhum dhum" + energyLevel);
	}

}
