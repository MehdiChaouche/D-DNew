package warriors.engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import warriors.contracts.GameState;
import warriors.contracts.Hero;
import warriors.contracts.Map;
import warriors.contracts.WarriorsAPI;
import warriors.engine.board.Box;
import warriors.engine.board.EmptyBox;
import warriors.engine.board.ennemis.DragonBox;
import warriors.engine.board.ennemis.GoblinBox;
import warriors.engine.board.ennemis.SorcererBox;
import warriors.engine.board.potions.BigPotionBox;
import warriors.engine.board.potions.MediumPotionBox;
import warriors.engine.board.potions.SmallPotionBox;
import warriors.engine.board.spells.FireBallBox;
import warriors.engine.board.spells.LightningBox;
import warriors.engine.board.weapons.BowBox;
import warriors.engine.board.weapons.ClubBox;
import warriors.engine.board.weapons.SwordBox;
import warriors.engine.Warrior;
import warriors.engine.Wizard;
import warriors.engine.Lancerd�;
import warriors.engine.Lancerd�6;
import warriors.engine.Debugger;

public class Warriors implements WarriorsAPI {
	
	Warrior DefaultWarrior = new Warrior();
	Wizard DefaultWizard = new Wizard();
	Lancerd� d�;

	private java.util.Map <String, Game> gamesArray;

	@Override
	public List<? extends Hero> getHeroes() {
		// TODO Auto-generated method stub
		List<Hero> temp = new ArrayList<Hero>();
		temp.add(DefaultWarrior);
		temp.add(DefaultWizard);
		return temp;
	}

	// Constructeur de Warriors
	
	public Warriors(String path) {
		d� = new Debugger(path);
		this.gamesArray = new HashMap<String, Game>();
	}

	public Warriors() {
		d� = new Lancerd�6();
		this.gamesArray = new HashMap<String, Game>();
	}


	// Map de base (it�ration 2)
	
	public List<? extends Map> newMap() {
		Box EmptyBox = new EmptyBox();
		Box SmallPotionBox = new SmallPotionBox();
		Box MediumPotionBox = new MediumPotionBox();
		Box BigPotionBox = new BigPotionBox();
		Box BowBox = new BowBox();
		Box ClubBox = new ClubBox();
		Box SwordBox = new SwordBox();
		Box LightningBox = new LightningBox();
		Box FireBallBox = new FireBallBox();
		Box GoblinBox = new GoblinBox();
		Box DragonBox = new DragonBox();
		Box SorcererBox = new SorcererBox();

		List<Box> map = new ArrayList<>();
		map.add(EmptyBox);
		map.add(BowBox);
		map.add(GoblinBox);
		map.add(LightningBox);
		map.add(ClubBox);
		map.add(GoblinBox);
		map.add(SmallPotionBox);
		map.add(LightningBox);
		map.add(GoblinBox);
		map.add(SorcererBox);
		map.add(BowBox);
		map.add(GoblinBox);
		map.add(SmallPotionBox);
		map.add(BowBox);
		map.add(GoblinBox);
		map.add(EmptyBox);
		map.add(LightningBox);
		map.add(GoblinBox);
		map.add(BowBox);
		map.add(SorcererBox);
		map.add(GoblinBox);
		map.add(ClubBox);
		map.add(LightningBox);
		map.add(GoblinBox);
		map.add(SorcererBox);
		map.add(BowBox);
		map.add(GoblinBox);
		map.add(SmallPotionBox);
		map.add(SmallPotionBox);
		map.add(GoblinBox);
		map.add(MediumPotionBox);
		map.add(SorcererBox);
		map.add(SmallPotionBox);
		map.add(EmptyBox);
		map.add(SorcererBox);
		map.add(SorcererBox);
		map.add(SorcererBox);
		map.add(ClubBox);
		map.add(MediumPotionBox);
		map.add(SorcererBox);
		map.add(BigPotionBox);
		map.add(SwordBox);
		map.add(MediumPotionBox);
		map.add(SorcererBox);
		map.add(DragonBox);
		map.add(EmptyBox);
		map.add(SorcererBox);
		map.add(FireBallBox);
		map.add(FireBallBox);
		map.add(EmptyBox);
		map.add(EmptyBox);
		map.add(DragonBox);
		map.add(SwordBox);
		map.add(EmptyBox);
		map.add(EmptyBox);
		map.add(DragonBox);
		map.add(EmptyBox);
		map.add(EmptyBox);
		map.add(EmptyBox);
		map.add(EmptyBox);
		map.add(EmptyBox);
		map.add(DragonBox);
		map.add(EmptyBox);
		map.add(EmptyBox);
		
		List<Map> newmap = new ArrayList<>();
		BoardMap defaultMap = new BoardMap("Carte par d�faut", 64, map);
		newmap.add(defaultMap);
		return newmap;
	}
	
	@Override
	public List<? extends Map> getMaps() {
		// TODO Auto-generated method stub
		return newMap();
	}

	@Override
	public GameState createGame(String playerName, Hero hero, Map map) {
		Game game = new Game(playerName, hero, map);
		gamesArray.put(game.getGameId(), game);
		return game ;
	}

	@Override
	public GameState nextTurn(String gameId) {
		Game game = gamesArray.get(gameId);
		int nextDice = d�.diceRoll();
		game.nextT(nextDice);
		return game ;

	}

	public java.util.Map<String, Game> getGamesArray() {
		return gamesArray;
	}

	public void setGamesArray(java.util.Map<String, Game> gamesArray) {
		this.gamesArray = gamesArray;
	}
}