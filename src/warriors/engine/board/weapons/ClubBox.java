package warriors.engine.board.weapons;

import warriors.engine.board.Box;
import warriors.engine.board.BoxType;

public class ClubBox extends Box {
	
	//ATTRIBUTS
	String name;
	int boxLevel;
	
	public ClubBox() {
		super();
		this.name = "Une massue";
		this.boxLevel = 3;
	}

	@Override
	public BoxType getType() {
		return BoxType.WEAPON ;
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
