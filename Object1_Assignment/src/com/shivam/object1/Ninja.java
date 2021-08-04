package com.shivam.object1;

public class Ninja extends Human {
	private int stealth = 10;

//	public Ninja(int stealth) {
//		super();
//		this.stealth = stealth;
//	}

		public Ninja() {
		this.stealth = stealth;
	}
	
	public void steal(Human human) {
		System.out.println(stealth);
		human.setHealth(human.getHealth() - stealth);
		stealth+=stealth;
		System.out.println("human health is " + human.getHealth() +"Stealth is" + stealth);
	}
	
	public void runAway() {
		System.out.println(getHealth());
		setHealth(getHealth()-10);
		System.out.println(getHealth());
	}


}
