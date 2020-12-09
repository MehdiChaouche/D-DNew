package warriors.engine;

import java.time.LocalDateTime;

import warriors.contracts.GameStatus;
import warriors.contracts.Hero;
import warriors.contracts.Map;
import warriors.engine.board.Box;
import warriors.engine.board.BoxType;
import warriors.engine.Lancerdé;
import warriors.engine.Lancerdé6;

public class Game implements warriors.contracts.GameState {
	private String gameIdGenerator() {
		return String.valueOf(LocalDateTime.now());
	}

	private String playerName;
	private String gameId;
	private GameStatus gameStatus;
	private Character hero;
	private BoardMap map;
	private String log;
	private int currentCase;
	
	
	public Game(String playerName, Hero hero, Map map) {
		super();
		this.playerName = getPlayerName();
		this.gameId = gameIdGenerator();
		this.gameStatus = GameStatus.IN_PROGRESS;
		this.hero = (Character) hero;
		this.map = (BoardMap) map;
		this.log = "Que la partie commence... Vous êtes sur la case départ." ;
		this.currentCase = 0 ;
	}
	
	
	public Game nextT(int DiceRoll) { 
		this.gameStatus = movePlayer(DiceRoll);
		if (gameStatus == GameStatus.FINISHED) {
			setLastLog("Félicitations, vous avez gagné !");
		}else {
			applyBoxes();
		}
		return this;
	}
	
	public GameStatus movePlayer(int diceResult) {
		int numberOfCase = getMap().getNumberOfCase();
		currentCase =  Math.min(numberOfCase - 1, currentCase + diceResult);
		if (currentCase == numberOfCase - 1) {
			return GameStatus.FINISHED;
		}
		return GameStatus.IN_PROGRESS;
	}

	private void applyBoxes() {
		Box currentBox = this.map.getBox(this.currentCase);
		setLastLog("Vous êtes sur la case : " + getCurrentCase() + "/" + this.map.getNumberOfCase() + "\nCase : " + currentBox.message() + " => ");

		if(currentBox.getType() == BoxType.POTION) {
			appendMessagesToLog(this.hero.applyPotion(currentBox));
		}

		if(currentBox.getType() == BoxType.WEAPON) {
			appendMessagesToLog(this.hero.applyWeapon(currentBox));
		}

		if(currentBox.getType() == BoxType.SPELL) {
			appendMessagesToLog(this.hero.applySpell(currentBox));
		}

		else if (currentBox.getType() == BoxType.BOSS) {
			appendMessagesToLog(this.hero.applyFight(currentBox));
		}
	}

	private void appendMessagesToLog(String message) {
		log = log + message ;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	public String getGameId() {
		return gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public GameStatus getGameStatus() {
		return gameStatus;
	}
	public void setGameStatus(GameStatus gameStatus) {
		this.gameStatus = gameStatus;
	}

	public void setHero(Character hero) {
		this.hero = hero;
	}

	public Hero getHero() {
		return hero;
	}
	public void setMap(BoardMap map) {
		this.map = map;
	}
	public Map getMap() {
		return map;
	}

	public String getLastLog() {
		return log;
	}
	public void setLastLog(String lastLog) {
		this.log = lastLog;
	}
	public int getCurrentCase() {
		return currentCase;
	}
	public void setCurrentCase(int currentCase) {
		this.currentCase = currentCase;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
}