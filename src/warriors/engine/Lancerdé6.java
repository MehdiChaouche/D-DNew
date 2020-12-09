package warriors.engine;

import java.util.concurrent.ThreadLocalRandom;

public class Lancerdé6 extends Lancerdé {

	@Override
	public int diceRoll() {
		// TODO Auto-generated method stub
		int result = ThreadLocalRandom.current().nextInt(1, 6 + 1);
		System.out.println("Tirage du dé : " + result);
		return result;
	}
}
