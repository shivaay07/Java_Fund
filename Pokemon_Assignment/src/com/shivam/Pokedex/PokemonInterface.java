package com.shivam.Pokedex;



public interface PokemonInterface {
	//this is interface so we can create only abstract methods here (only methods body)

	//1. Abstract method to create pokemon
	
	public Pokemon createPokemon(String name,String type, int health);
	
	
//	2. Abstract method for pokemon info
	
	public String pokemonInfo(Pokemon pokemon);
	
	
//	3. Abstract method to list all pokemon
	
	public void listPokemon();

}
