package com.shivam.zoo1;

public class Gorilla extends Mammal {

	public Gorilla() {
		
	}

	public void throwSomething() {
//		int energy = getEnergyLevel();
//		energy = energy - 5;
		setEnergyLevel(getEnergyLevel()-5);
		System.out.println("energy is " + getEnergyLevel());
//		return energy;
	}
	public void eatBananas() {
		setEnergyLevel(getEnergyLevel()+10);
		System.out.println("I am satisfied " + getEnergyLevel());
	}
	public void climb() {
		setEnergyLevel(getEnergyLevel()-10);
		System.out.println("I am climbing...uhhhh " + getEnergyLevel());
	}
	
}
