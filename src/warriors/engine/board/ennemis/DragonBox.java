package warriors.engine.board.ennemis;

import warriors.engine.board.Box;
import warriors.engine.board.BoxType;

public class DragonBox extends Box{

	String name;
	int boxLevel;
	int boxLife;

	public DragonBox() {
		super();
		this.name="Un dragon";
		this.boxLevel=4;
		this.boxLife= 15;
		// TODO Auto-generated constructor stub
	}

	@Override
	public BoxType getType() {
		return BoxType.BOSS ;
	}

	@Override
	public String message() {
		return name + " de force " + boxLevel ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBoxLevel() {
		return boxLevel;
	}

	public void setBoxLevel(int boxLevel) {
		this.boxLevel = boxLevel;
	}

	public int getBoxLife() {
		return boxLife;
	}

	public void setBoxLife(int boxLife) {
		this.boxLife = boxLife;
	}

}
