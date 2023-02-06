package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
		hand = new ArrayList<>();
	}

	@Override
	public int getHandValue() {
		int value = 0;
		if (this.hand.size() > 0) {
			for (Card card : this.hand) {
				if (card != null) {
					value += card.getValue();

				}
			}
		}
		return value;
	}

	public boolean isBlackjack() {
		if (this.getHandValue() == 21) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isBust() {
		if (this.getHandValue() > 21) {
			return true;
		} else {
		}
		return false;
	}

}
