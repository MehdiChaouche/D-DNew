package warriors.engine;

import warriors.contracts.Hero;

public class Wizard extends Character {

	private String name;
	private String image;
	private int life;
	private int attackLevel;
	private int MAX_LIFE;

	// Constructeur
	public Wizard() {
		super();
		this.name="Magicien";
		this.image= "ImageWizard";
		this.life=3;
		this.attackLevel=8;
		this.MAX_LIFE=13;
		// TODO Auto-generated constructor stub
	}


	// Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttackLevel() {
		return attackLevel;
	}

	public void setAttackLevel(int attackLevel) {
		this.attackLevel = attackLevel;
	}

	public int getMAX_LIFE() {
		return MAX_LIFE;
	}

	public void setMAX_LIFE(int mAX_LIFE) {
		MAX_LIFE = mAX_LIFE;
	}
}