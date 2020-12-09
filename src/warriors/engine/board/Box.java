package warriors.engine.board;

public abstract class Box {
	
	//Attributs
	private String name ;
	private int boxLevel;
	private int boxLife;
	
	public Box() {
		this.setName(name);
		this.setBoxLevel(boxLevel);
		this.setBoxLife(boxLife);
	}
	
	public abstract BoxType getType();

	public abstract String message();

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