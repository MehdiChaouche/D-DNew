package warriors.engine;

import warriors.contracts.Hero;
import warriors.engine.board.Box;


public abstract class Character implements Hero {

	private String name ;
	private int life;
	private int attackLevel;

	// Constructeur
	public Character() {
		super();
		this.setName(name);
		this.setLife(life);
		this.setAttackLevel(attackLevel);
	}

	public String applyPotion(Box currentBox) {
		// Si Warrior :
		if (getLife() < 10) {
			setLife(getLife() + currentBox.getBoxLevel());
			return "\nVous prenez une " + currentBox.getName() + " de niveau " + currentBox.getBoxLevel() + "\n=> Votre niveau de vie est d�sormais de " + getLife() + " points";
		}else {
			return "Votre personnage a atteint sa vie maximale.";
		}
	}

	public String applyWeapon(Box currentBox) {
		// Si Warrior :
		if (getName().equalsIgnoreCase("guerrier") && getAttackLevel() < 10) {
			setAttackLevel(getAttackLevel() + currentBox.getBoxLevel());
			return "\nVous prenez " + currentBox.getName() + " de niveau " + currentBox.getBoxLevel() + "\n=> Votre niveau d'attaque est d�sormais de " + getAttackLevel()+ " points";
		}else {
			return "Vous trouvez " + currentBox.getName() + " de niveau " + currentBox.getBoxLevel() + "\nVotre personnage ne peut pas prendre cet �quipement";
		}
	}

	public String applySpell(Box currentBox) {
		// Si Warrior :
		if (getName().equalsIgnoreCase("magicien") && getAttackLevel() < 13) {
			setAttackLevel(getAttackLevel() + currentBox.getBoxLevel());
			return "\nVous prenez " + currentBox.getName() + " de niveau " + currentBox.getBoxLevel() + "\n=> Votre niveau d'attaque est d�sormais de " + getAttackLevel()+ " points";
		}else {
			return "Vous trouvez " + currentBox.getName() + " de niveau " + currentBox.getBoxLevel() + "\nVotre personnage ne peut pas prendre cet �quipement";
		}
	}

	public String applyFight(Box currentBox) {
		currentBox.setBoxLife(currentBox.getBoxLife() - getAttackLevel());
		if (currentBox.getBoxLife() > 0) {
			setLife(getLife() - currentBox.getBoxLevel());
			if (getLife() > 0 ) {
				return "\nVous n'avez pas vaincu : " + currentBox.getName() + " de force " + currentBox.getBoxLevel() +". Il lui reste " + currentBox.getBoxLife() +" point(s) de vie" + "\nL'ennemi r�plique\n=> Votre niveau de vie est d�sormais de " + getLife() + " points";
			}else {
				return "\nVous n'avez pas vaincu : " + currentBox.getName() + " de force " + currentBox.getBoxLevel() +". Il lui reste " + currentBox.getBoxLife() +" point(s) de vie" + "\nL'ennemi r�plique\n=> Vous �tes mort...";
			}
		}else {
			return "Bravo ! Vous avez triomph� de l'ennemi : " + currentBox.getName() + " avec " + currentBox.getBoxLevel() + " de force. ";
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
}