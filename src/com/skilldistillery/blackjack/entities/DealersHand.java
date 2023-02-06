package com.skilldistillery.blackjack.entities;

import java.util.Collections;
import java.util.List;

public class DealersHand implements PlayerLogic {

	private Deck deck;
	private BlackjackHand hand = new BlackjackHand();

	public DealersHand() {
		hand = new BlackjackHand();
	}

	@Override
	public int getHandValue() {
		return hand.getHandValue();
	}

	@Override
	public boolean isBlackjack() {
		return hand.isBlackjack();
	}

	@Override
	public boolean isBust() {
		return hand.isBust();
	}

	@Override
	public boolean stay() {
		return false;
	}

	public void shuffle() {
		Collections.shuffle((List<?>) this.deck);
	}

	public Card giveCard(Deck deck) {
		Card card = deck.dealCard();
		hand.addCard(card);
		return card;
	}

	public boolean canHit() {
		if (this.getHandValue() < 17) {
			return true;
		} else {
			return false;
		}
	}

	public void hit(Card card) {
		hand.addCard(card);
	}
	public void receiveCard(Deck deck) {
		Card card = deck.dealCard();
		hand.addCard(card);
		System.out.println("Dealer gets card " + card + card.getValue());
	}
	public void hiddenCard(Deck deck) {
		Card card = deck.dealCard();
		hand.addCard(card);
		System.out.println("Dealer gets undercard ");
	}
	


}
