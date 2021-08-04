package com.shivam.object1;

public class Wizard extends Human {
	private int health = 50;
	private int intelligence =8;

	public Wizard() {
		this.health = health;
		this.intelligence = intelligence;
	}

	public void heal(Human human) {
		human.setHealth(human.getHealth()+intelligence);
		System.out.println(human.getHealth());
	}
	
	public void fireball(Human human) {
		human.setHealth(human.getHealth()-(intelligence*3));
		System.out.println(human.getHealth());
	}
}
