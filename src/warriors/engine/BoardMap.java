package warriors.engine;


import java.util.ArrayList;
import java.util.List;

import warriors.contracts.Map;
import warriors.engine.board.Box;



public class BoardMap implements Map {

	protected String name;
	protected int numberOfCase;	
	protected List<Box> box = new ArrayList<Box>();

	// Constructeur
	public BoardMap(String name, int numberOfCase, List<Box> box) {
		super();
		this.name = name;
		this.numberOfCase = numberOfCase;
		this.box = box;
	}

	
	// Getters & Setters
	public Box getBox(int currentcase) {
		return box.get(currentcase);
	}
	
	public void setBox(List<Box> box) {
		this.box = box;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfCase() {
		return numberOfCase;
	}

	public void setNumberOfCase(int numberOfCase) {
		this.numberOfCase = numberOfCase;
	}

}