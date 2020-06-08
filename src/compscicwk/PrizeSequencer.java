package compscicwk;

import componenttemplates.Sequencer;
import componenttemplates.Selector;

public class PrizeSequencer extends Sequencer {

	public static void main(String[] args) {

		Sequencer sequence = new PrizeSequencer();
		sequence.runSequence();

	}

	public void runSequence() {

		Selector<Integer> prizeChoice = new PrizeSelector();
		prizeChoice.runSelection(ChoosePrize.prize());

	}
}