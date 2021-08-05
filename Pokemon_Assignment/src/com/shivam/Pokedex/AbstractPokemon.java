package com.shivam.Pokedex;

public abstract class AbstractPokemon implements PokemonInterface {

	public AbstractPokemon() {
		
	}
	
//	create pokemon method --------------------------------------------------
	
	public Pokemon createPokemon(String name, String type, int health) {
		Pokemon pokemon = new Pokemon(name, type, health);
		return pokemon;
	}
	
//	pokemonInfo method --------------------------------
	
	public String pokemonInfo(Pokemon pokemon) {
		String name = pokemon.getName();
		String type= pokemon.getType();
		int health = pokemon.getHealth();
		System.out.println("name " + name + "\n type is " + type + "\n health is " + health );
		return name;
	}
	

}
