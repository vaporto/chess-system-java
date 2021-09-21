package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		//position será instanciada com valor nulo pelo compilador Java
	}

	protected Board getBoard() {
		return board;
	}

	
	
	
	
}
