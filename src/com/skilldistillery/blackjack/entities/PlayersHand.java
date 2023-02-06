package com.skilldistillery.blackjack.entities;

public class PlayersHand implements PlayerLogic {

	private BlackjackHand hand;

	public PlayersHand() {
		hand = new BlackjackHand();
	}

	public int getHandValue() {
		return hand.getHandValue();
	}

	public void receiveCard(Deck deck) {
		Card card = deck.dealCard();
		hand.addCard(card);
		System.out.println("Dealer gives you " + card + card.getValue());
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

}
