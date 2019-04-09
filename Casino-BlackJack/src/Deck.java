//Author: Veronica Vergara

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Deck extends ArrayList<Card> {

	
	private int size;
	//private String rank;

	public Deck(String[] rank, String[] suit, int[] value) {
		super();
		for (int i = 0; i < rank.length; i++) {
			for (String suitString : suit) {
				this.add(new Card(rank[i], suitString, value[i]));
			}
		}
		shuffle();
	}

	public boolean isEmpty() {
		boolean isempty = false;
		if(size == 0) {
			isempty = true;
		}
		return isempty;
	}

	public int size() {
		return size;
	}

	public void shuffle() {
		for (int i = this.size() - 1; i > 0; i--) {
			int num = i + 1;
			int start = 0;
			int pos = (int) (Math.random() * num) + start;
			Card temp = this.get(i);
			this.set(i, this.get(pos));
			this.set(pos, temp);
		}
		size = this.size();
	}

	public Card deal() {
		if (isEmpty()) {
			return null;
		}
		return this.remove(this.size() - 1);
	}
	
//	@Override
//	public String toString() {
//		String x = "size = " + size + "\nUndealt cards: \n";

//		for (int i = size - 1; i >= 0; i--) {
//			x += cards.get(k);
//			if (i != 0) {
//				x = x + ", ";
//			}
//			if ((size - i) % 2 == 0) {
//				x = x + "\n";
//			}
//		}

//		x += "\nDealt cards: \n";
//		for (int j = cards.size() - 1; j >= size; j--) {
//			x = x + cards.get(j);
//			if (j != size) {
//				x = x + ", ";
//			}
//			if ((j - cards.size()) % 2 == 0) {
//				x = x + "\n";
//			}
//		}

//		x += "\n";
//		return x;
//	}
}
