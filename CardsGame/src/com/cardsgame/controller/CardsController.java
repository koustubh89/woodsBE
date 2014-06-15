package com.cardsgame.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.cardsgame.model.Card;

public class CardsController {


    public CardsController() {

	}
    
    public static Map cardsDistribute() {
        ArrayList<Card> player1 = new ArrayList<Card>();
        ArrayList<Card> player2 = new ArrayList<Card>();
        ArrayList<Card> player3 = new ArrayList<Card>();
        ArrayList<Card> player4 = new ArrayList<Card>();
 
        ArrayList<Card> deck = Card.newDeck();
        System.out.println("deck before shuffling");
        for(int i=0;i<52;i++)
        {
        	System.out.print(deck.get(i)+"--");
        }
        Collections.shuffle(deck);
        System.out.println();
        System.out.println("deck after shuffling");
        for(int i=0;i<52;i++)
        {
        	System.out.print(deck.get(i)+"--");
        }
        System.out.println();
        int j = 1;
        for (int i = 0; i < 52; i++) {
            if (j == 1) {
                player1.add(deck.get(i));
                j++;
                continue;
            } else if (j == 2) {
                player2.add(deck.get(i));
                j++;
                continue;
            } else if (j == 3) {
                player3.add(deck.get(i));
 
                j++;
                continue;
            } else if (j == 4) {
                player4.add(deck.get(i));
                j = 1;
                continue;
            }
        }
   
        Map<String, ArrayList<Card>> map = new HashMap<String, ArrayList<Card>>();
        map.put("Player 1", player1);
        map.put("Player 2", player2);
        map.put("Player 3", player3);
        map.put("Player 4", player4);
		return map;
    }
}