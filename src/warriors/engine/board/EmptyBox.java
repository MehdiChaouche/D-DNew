package warriors.engine.board;

public class EmptyBox extends Box {
	
	@Override
	public BoxType getType() {
		return BoxType.EMPTY ;
	}
	
	@Override
	public String message() {
		return "Vous êtes sur une case vide.";
	}

}
