package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.DealersHand;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.PlayersHand;

public class BlackjackApp {

	private PlayersHand player;
	private DealersHand dealer;
	private Deck deck;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BlackjackApp app = new BlackjackApp();
		app.run();

	}

	private void run() {
		playBlackJack();

	}

//	 if dealer gets to 17 he cannot hit he must stay but if less he must hit
//	player can choose to hit or stay at any number if they pass 21 they bust
	private void playBlackJack() {
		this.player = new PlayersHand();
		this.dealer = new DealersHand();
		deck = new Deck();
		deck.shuffleCards();
		drawTwoCards();
//		System.out.println(
//				"Players hand: " + this.player.getHandValue() + "\n" + "Dealers shown card: " );
		boolean shouldQuitProgram = false;
		do {
			hitOrDontHit();
		} while (!shouldQuitProgram);

	}

	public void drawTwoCards() {
		System.out.println("Giving first two cards");
//		for (int i = 0; i < 2; i++) {
//			this.player.receiveCard(deck);
//			this.dealer.hit(deck.dealCard());
//		}
		System.out.println();
		player.receiveCard(deck);
		dealer.hiddenCard(deck);
		player.receiveCard(deck);
		dealer.receiveCard(deck);

	}

	public void hitOrDontHit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Your total is : " + player.getHandValue());
		System.out.println("Player do you wanna hit or stay?   \n 1: hit \n 2: stay ");
		int userSelection = sc.nextInt();
		sc.nextLine();
		switch (userSelection) {
		case 1:
			System.out.println("Dealer is giving you a card. ");
			player.receiveCard(deck);
			System.out.println("Your total is now : " + player.getHandValue());
			if (player.getHandValue() == 21) {
				System.out.println("BLACKJACK!");
				System.exit(0);
			} else if (player.getHandValue() > 21) {
				System.out.println("You busted! ");
			} else if (player.getHandValue() == dealer.getHandValue())
				System.out.println("You tie! ");
			System.exit(0);
			break;
		case 2:
			System.out.println("You chose to stay! ");
			break;
		}
		dealerHit();
	}

	public void dealerHit() {
		while (dealer.getHandValue() < 17) {
			System.out.println("Dealer will now hit! ");
			dealer.giveCard(this.deck);
			System.out.println("Dealers total is : " + dealer.getHandValue());
			if(dealer.getHandValue() > 21) {
				System.out.println("Dealer busted! ");
				System.exit(0);
			}
			if(dealer.getHandValue() == 21) {
				System.out.println("BLACKJACK!");
				System.exit(0);
			}
		}

	}

}
