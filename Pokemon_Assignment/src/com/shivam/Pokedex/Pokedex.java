package com.shivam.Pokedex;
import java.util.ArrayList;

public class Pokedex extends AbstractPokemon implements PokemonInterface {
	ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>() ;
	public Pokedex() {
		// TODO Auto-generated constructor stub
	}
	
	public Pokemon createPokemon(String name, String type, int health) {
		Pokemon pokemon = super.createPokemon(name, type, health);
		myPokemons.add(pokemon);
		return pokemon;
	}

	@Override
	public void listPokemon() {
		for(Pokemon poke : myPokemons) {
			super.pokemonInfo(poke);
		}
	}

}
