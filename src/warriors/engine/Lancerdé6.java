package warriors.engine;

import java.util.concurrent.ThreadLocalRandom;

public class Lancerd�6 extends Lancerd� {

	@Override
	public int diceRoll() {
		// TODO Auto-generated method stub
		int result = ThreadLocalRandom.current().nextInt(1, 6 + 1);
		System.out.println("Tirage du d� : " + result);
		return result;
	}
}
