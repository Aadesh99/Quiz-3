package cardMain;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class deck {

	private ArrayList<Card> DeckofCards = new ArrayList<Card>();

	public deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				DeckofCards.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(DeckofCards);
	}

	public Card Draw() throws DeckException {

		if (DeckofCards.size() == 0)
		{
			throw new DeckException(this); 
		}
		return DeckofCards.remove(0);

	}

	public Card Draw(eSuit eSuit) {
		for (Card c : DeckofCards) {
			if (c.geteSuit()==eSuit) {
				DeckofCards.remove(c);
				return (c);
			}
		}
		return (null);
	}
	
	public Card Draw(eRank eRank) {
		for (Card c : DeckofCards) {
			if (c.geteRank() == eRank) {
				DeckofCards.remove(c);
				return (c);
			}
		}
		return (null);
	}

	public int getiDeckCount()
	{
		return DeckofCards.size();
	}
	
	public int getRemaining(Object eNum) {
		int count = 0;
		if (eNum instanceof eRank)
		{
			for (Card c : DeckofCards) {
				if (c.geteRank() == eNum) {
					count+=1;
				}
			}
		}
		
		
		else
		{
			for (Card c : DeckofCards) {
				if (c.geteSuit() == eNum) {
					count+=1;
				}
			}
		}
		
		return count;
	}
}