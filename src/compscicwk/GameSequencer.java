package compscicwk;

import componenttemplates.Sequencer;
import componenttemplates.Selector;

public class GameSequencer extends Sequencer {

	public static void main(String[] args) {

		Sequencer sequence = new GameSequencer();
		sequence.runSequence();

	}

	public void runSequence() {

		// Second in sequence
		Selector<Integer> gameChoice = new GameSelector();
		gameChoice.runSelection(ChooseGame.game());

	}
}
