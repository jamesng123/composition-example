package compscicwk;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import componenttemplates.ChooseEvent;

public class ChooseGame extends ChooseEvent{
	
	public static int game() {
		
		ChooseEvent event = new ChooseGame();
		return event.Event();
		
	}
	
	public int Event(){
		int gameChoice = 0;
		
		System.out.println(
				"What game would you like to play?\n\n"
				+ "1. Heads or Tails\n"
				+ "2. Guess the Number");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			gameChoice = Integer.parseInt(reader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gameChoice;
	}

}
