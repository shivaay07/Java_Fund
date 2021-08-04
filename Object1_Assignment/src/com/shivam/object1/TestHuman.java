package com.shivam.object1;

public class TestHuman {

	public TestHuman() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Human human1 = new Human();
		Human human2 = new Human();
		human1.attack(human1);
		human1.attack(human2);
		human1.attack(human2);
//		System.out.println("----------------------");
//		Wizard wizard1 = new Wizard();
//		wizard1.heal(human2);
//		
//		System.out.println("----------------------");
		
//		wizard1.fireball(human2);
		
		System.out.println("----------------------");	
		
//		Ninja ninja1 = new Ninja();
//		ninja1.steal(human2);
//		ninja1.runAway();
		
		Samurai sam = new Samurai();
		Samurai sam2 = new Samurai();
		Samurai sam3 = new Samurai();
//		sam.deathBlow(human2);
		sam.meditate();
		sam.howMany();
	}
	

}

