package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	protected List<Card> hand;

	public Hand() {
		hand = new ArrayList<>();
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public void addCard(Card card) {
		this.hand.add(card);

	}

	public void clear() {
		this.hand.removeAll(hand);
	}

	public abstract int getHandValue();

	public int getHandSize() {
		return this.hand.size();
	}

//	@Override
//	public String toString() {
//		return "Hand [hand=" + hand + "]";
//	}

}
