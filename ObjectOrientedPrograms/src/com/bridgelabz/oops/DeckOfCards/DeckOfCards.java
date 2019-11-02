package com.bridgelabz.oops.DeckOfCards;
import java.util.Random;

public class DeckOfCards {
	
		
	public static void main(String[] args) {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

	        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
	        					"Jack", "Queen", "King", "Ace"};

	        // initialize deck
	        int n = suits.length*ranks.length;
	        String[] cards = new String[n];
	        for (int i = 0; i < ranks.length; i++) {
	            for (int j = 0; j < suits.length; j++) {
	                cards[suits.length*i + j] = ranks[i] + " of " + suits[j];
	            }
	        }

	       
	        for (int i = 0; i < n; i++) {
	        	Random rand = new Random();
	        	int r = i+ rand.nextInt(52-i); 
	        
	            String temp = cards[r];
	            cards[r] = cards[i];
	            cards[i] = temp;
	        }

	        // print shuffled deck
	        System.out.println("First 9 for player 1=========================>>>>");
	        for(int i=0;i<9;i++) {
	        	System.out.println(cards[i]);
	        }
	        System.out.println("First 9 for player 2======================");
	        for(int i=9;i<18;i++) {
	        	System.out.println(cards[i]);
	        }
	        System.out.println("First 9 for player 30==================");
	        for(int i=18;i<27;i++) {
	        	System.out.println(cards[i]);
	        }
	        System.out.println("First 9 for player 4================");
	        for(int i=27;i<36;i++) {
	        	System.out.println(cards[i]);
	        }

}
}
