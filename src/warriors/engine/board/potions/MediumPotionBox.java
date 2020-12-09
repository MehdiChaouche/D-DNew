package warriors.engine.board.potions;

import warriors.engine.board.Box;
import warriors.engine.board.BoxType;

public class MediumPotionBox extends Box {
	
	String name;
	int boxLevel;

	public MediumPotionBox() {
		super();
		this.name="Potion de vie standard";
		this.boxLevel=2;
	}

	@Override
	public BoxType getType() {
		return BoxType.POTION ;
	}

	@Override
	public String message() {
		return name + " de niveau + " + boxLevel ;
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
