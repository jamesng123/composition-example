package compscicwk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import componenttemplates.ChooseEvent;

public class ChoosePrize extends ChooseEvent {

	static int prize() {

		ChooseEvent event = new ChoosePrize();
		return event.Event();

	}

	public int Event() {

		int prizeChoice = 0;

		System.out.println("What prize would you like?\n\n" + "1. Teddy Bear\n" + "2. Rubber Duck");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			prizeChoice = Integer.parseInt(reader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prizeChoice;

	}

}
