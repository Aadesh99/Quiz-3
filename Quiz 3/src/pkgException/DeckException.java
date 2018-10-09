package pkgException;

import cardMain.deck;

public class DeckException extends Exception {

	private deck d;

	public DeckException(deck d) {
		super();
		this.d = d;
	}

	protected deck getD() {
		return d;
	}
	
}