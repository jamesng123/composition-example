package compscicwk;

import componenttemplates.Selector;

public class GameSelector extends Selector<Integer> {

	public void runSelection(Integer c) {

		int choice = c;

		switch (choice) {
		case 1:
			HeadsTails.headsTails();
			break;
		case 2:
			GuessTheNumber.numberGuess();
			break;
		}
	}
}
