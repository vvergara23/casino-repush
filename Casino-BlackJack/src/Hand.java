import java.util.ArrayList;

public class Hand extends ArrayList<Card> implements Comparable<Hand>{
	
	
	public Hand() {
		
	}
	/*
	 * 
	 */
	
	public int score() {
		int i = 0;
		boolean ace = false;
		for(Card card : this) {
			i += card.getValue();
			if(card.getRank() == "ace") {
				ace = true;
			}
		}
		if (i > 21) {
			if(ace) {
				i -= 10;
			}
		}
		return i;
	}
	public int compareTo(Hand other) {
		int x = this.score();
		int y = other.score();
		if(x==y) {
			return 0;
		} else if(x>y) {
			return 1;
		} else {
			return -1;
		}
	}
	@Override
	public String toString() {
		String i = "";
		for(Card card : this) {
			i += card;
			i += "\n";
		}
		return i;
	}
	
}