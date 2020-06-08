package compscicwk;

import componenttemplates.Prize;

public class TeddyBear extends Prize {

	public static void giveTeddyBear() {

		Prize prize = new TeddyBear();
		prize.givePrize();

	}

	public void givePrize() {

		System.out.println("Well done, you have won a teddy bear!");

	}

}
