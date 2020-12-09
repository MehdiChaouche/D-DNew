package warriors.engine.board.spells;

import warriors.engine.board.Box;
import warriors.engine.board.BoxType;

public class LightningBox extends Box {

	String name;
	int boxLevel;

	public LightningBox() {
		super();
		this.name="Un sort d'éclair";
		this.boxLevel=2;
	}

	@Override
	public BoxType getType() {
		return BoxType.SPELL ;
	}

	@Override
	public String message() {
		return name + " de force + " + boxLevel ;

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

	
}
