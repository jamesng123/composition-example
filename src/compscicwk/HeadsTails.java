package compscicwk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import componenttemplates.Game;

public class HeadsTails extends Game {

	public static void headsTails() {

		Game game = new HeadsTails();
		game.runGame();

	}

	public void runGame() {

		String guess = null;
		String outcome = null;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Heads or Tails?");

		try {
			guess = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Random rand = new Random();
		int int_random = rand.nextInt(2);

		if (int_random == 1) {
			outcome = "Tails";
		} else {
			outcome = "Heads";
		}

		if (guess.equals(outcome)) {

			System.out.println("It was " + outcome + ". Correct. You have won a prize!");

		} else {

			System.out.println("It was " + outcome + ". You have lost. Try again.");

			System.exit(0);
		}

	}
}