package com.shivam.object1;

public class Samurai extends Human {
	private int health = 200;
	private static int noOfSamurai = 0;
	public Samurai() {
		this.health = health;
		noOfSamurai++;
	}

	public void deathBlow(Human human) {
		System.out.println(human.getHealth());
		human.setHealth(0);
		System.out.println(human.getHealth());
		System.out.println(health);
		health=health/2;
		System.out.println(health);
	}
	
	public void meditate() {
		System.out.println(health);
		health = health*1/2;
		System.out.println(health);
	}
	
	public static int howMany() {
		System.out.println(noOfSamurai);
		return noOfSamurai;
	}
}
