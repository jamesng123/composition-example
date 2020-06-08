package compscicwk;

import componenttemplates.Selector;

public class PrizeSelector extends Selector<Integer> {

	public void runSelection(Integer c) {

		int choice = c;

		switch (choice) {

		case 1:
			TeddyBear.giveTeddyBear();
			break;
		case 2:
			RubberDuck.giveRubberDuck();
			break;
		}
	}
}
