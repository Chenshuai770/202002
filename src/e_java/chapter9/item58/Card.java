package e_java.chapter9.item58;

import java.util.*;

/**
 * FileName: Card
 * Date: 2020/10/19 10:19
 * Author:cs
 * Description:
 */
public class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }



    static Collection<Suit> suits = Arrays.asList(Suit.values());
    static Collection<Rank> ranks = Arrays.asList(Rank.values());

    enum Suit {CLUB}//花色  梅花,方块,红桃,黑桃
//    enum Suit {CLUB, DIAMOND, HEART, SPADE}//花色  梅花,方块,红桃,黑桃

    enum Rank {ACE, DEUCE}//牌的顺序 a23456789jqk
//    enum Rank {ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KIN}//牌的顺序 a23456789jqk

    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();


      /*  for (Iterator<Suit> i = suits.iterator(); i.hasNext(); ) {
            for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); ) {
                cards.add(new Card(i.next(),j.next()));
            }
        }*/

                // Preferred idiom for nested iteration on collections and arrays
        for (Suit suit : suits)
            for (Rank rank : ranks)
                cards.add(new Card(suit, rank));



        System.out.println(cards);

    }

}
