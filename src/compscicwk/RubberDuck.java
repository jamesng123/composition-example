package compscicwk;

import componenttemplates.Prize;

public class RubberDuck extends Prize {

	public static void giveRubberDuck() {

		Prize prize = new RubberDuck();
		prize.givePrize();

	}

	public void givePrize() {

		System.out.println("Well done, you have won a rubber duck!");

	}
}
