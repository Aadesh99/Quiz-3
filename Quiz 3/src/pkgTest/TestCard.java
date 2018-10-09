package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cardMain.deck;
import pkgEnum.eRank;
import pkgEnum.eSuit;

class TestCard {

	@Test
	void getRemaining_test1() {
		//Player draws 2 Diamonds and 2 spades. End result  should be 11 Diamonds, 11 Spades,  13 Hearts 13 Clubs remaining. 
		deck d1 = new deck();
		d1.Draw(eSuit.DIAMONDS);
		d1.Draw(eSuit.SPADES);
		d1.Draw(eSuit.DIAMONDS);
		d1.Draw(eSuit.SPADES);
		
		assertTrue(d1.getRemaining(eSuit.HEARTS) == 13);
		assertTrue(d1.getRemaining(eSuit.SPADES) == 11);
		assertTrue(d1.getRemaining(eSuit.CLUBS) == 13);
		assertTrue(d1.getRemaining(eSuit.DIAMONDS) == 11);
		
		//Player draws 2 Diamonds-ACE and NINE and 2 spades-Queen and Six. Should be 3 ACES,QUEENS,SIX,NINE remaining
		deck d2 = new deck();
		d2.Draw(eRank.ACE);
		d2.Draw(eRank.NINE);
		d2.Draw(eRank.SIX);
		d2.Draw(eRank.QUEEN);
		
		assertTrue(d2.getRemaining(eRank.ACE) == 3);
		assertTrue(d2.getRemaining(eRank.SIX) == 3);
		assertTrue(d2.getRemaining(eRank.NINE) == 3);
		assertTrue(d2.getRemaining(eRank.QUEEN) == 3);
	}

}