package com.shivam.Pokedex;

public class TestPokemon {

	public TestPokemon() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon("wizard", "fire", 20);
		Pokemon balbasaur = new Pokemon("kite", "sky", 30);
		Pokedex pod = new Pokedex();
		balbasaur.attackPokemon(pikachu);
		pod.createPokemon("turtle", "water", 10);
		pod.listPokemon();

	}

}
