package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> deck = new ArrayList<>(52);

	public Deck() {
		Rank[] ranks = Rank.values();
		Suit[] suits = Suit.values();
		for (Suit suit : suits) {
			for (Rank rank : ranks) {
				Card card = new Card(suit, rank);
				deck.add(card);
				
			}
		}

	}

	public List<Card> getDeck() {
		return deck;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
	
	public Card dealCard() {
		return deck.remove(0);
	}

	public void shuffleCards() {
		 Collections.shuffle(deck);
	}
	public int checkDeckSize() {
		return deck.size();
	}
}
