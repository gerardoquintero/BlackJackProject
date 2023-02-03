package com.skilldistillery.blackjack.entities;

public enum Suit {

	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");

	private String name;

	Suit(String n) {
		this.name = n;
	}

	public void ctor() {

	}

	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

}
