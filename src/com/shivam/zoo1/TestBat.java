package com.shivam.zoo1;

public class TestBat {

	public TestBat() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Bat badBat = new Bat();
		Bat badBat2 = new Bat();
		badBat.fly();
		System.out.println("--------------------");
		badBat2.fly();
		System.out.println("--------------------");
		badBat.eatHuman();
		System.out.println("--------------------");
		badBat2.eatHuman();
		System.out.println("--------------------");
		badBat.attackTown();
		System.out.println("--------------------");
		badBat2.attackTown();

	}

}
