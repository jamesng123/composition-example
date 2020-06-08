package compscicwk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import componenttemplates.Game;

public class GuessTheNumber extends Game {

	public static void numberGuess() {

		Game game = new GuessTheNumber();
		game.runGame();

	}

	public void runGame() {

		int guess = 0;
		int outcome = 0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Guess a number between 1 and 3");

		try {
			guess = Integer.parseInt(reader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Random rand = new Random();
		int int_random = rand.nextInt(3);

		if (int_random == 1) {
			outcome = 1;
		} else if (int_random == 2) {
			outcome = 2;
		} else {
			outcome = 3;
		}

		if (guess == outcome) {

			System.out.println("It was " + outcome + ". Correct. You have won a prize!");

		} else {

			System.out.println("It was " + outcome + ". You have lost. Try again.");

			System.exit(0);
		}

	}
}
