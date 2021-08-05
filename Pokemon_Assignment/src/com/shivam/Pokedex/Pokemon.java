package com.shivam.Pokedex;

public class Pokemon {
	
//	Member Variables or constructors
	
	private String name;
	private String type;
	private int health;
	
//	count static variable-------------------------------------------------
	
	private static int count = 0;
	
// constructor Method
	
//	public Pokemon() {
//		this.name = name;
//		this.type = type;
//		this.health = health; 
//		count++;
//	}
	
	
	public Pokemon(String name, String type, int health) {
		this.name = name;
		this.type = type;
		this.health = health;
		count++;
	}
//	
//	Getter and Setter -------------------------------------------------------------------------

//	get name----------------------------------------------------------------------------------------
	
	

	public String getName() {
		return name;
	}

// set name--------------------------------------------------------------------------------------------
	
	public void setName(String name) {
		this.name = name;
	}

//	get type------------------------------------------------------------------------------------------
	
	public String getType() {
		return type;
	}

// set type---------------------------------------------------------------------------------------------
	
	public void setType(String type) {
		this.type = type;
	}

// get health -------------------------------------------------------------------------------------------
	
	public int getHealth() {
		return health;
	}

// set health---------------------------------------------------------------------------------------------
	
	public void setHealth(int health) {
		this.health = health;
	}
	
//	Attack method
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.health -= 10;
		System.out.println(pokemon.getHealth());
	}

}
