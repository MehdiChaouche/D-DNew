package warriors.engine.board.weapons;

import warriors.engine.board.Box;
import warriors.engine.board.BoxType;

public class SwordBox extends Box {
	
	String name;
	int boxLevel;
	
	
	public SwordBox() {
		super();
		this.name="Une épée";
		this.boxLevel= 5;
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
