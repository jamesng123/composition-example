package compscicwk;

import componenttemplates.Sequencer;

public class GamePrizeSequencer extends Sequencer {

	public static void main(String[] args) {

		Sequencer sequence = new GamePrizeSequencer();
		sequence.runSequence();

	}

	public void runSequence() {

		Sequencer game = new GameSequencer();
		game.runSequence();

		Sequencer prize = new PrizeSequencer();
		prize.runSequence();

	}
}
