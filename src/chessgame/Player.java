package chessgame;

public class Player {
	public ChessPiece[] pieces;
	private String team;
	private int timelimit;
	public Boolean turn;

	//������
	Player(String team, int timelimit){
		this.team = team;
		this.timelimit = timelimit;
		this.pieces = new ChessPiece[16];
		
		if(this.team.equals("white")) {
			//���� ���� �����ϹǷ� turn�� true�� ����
			this.turn = true;
			//ü���� ä���
			pieces[0] = new ChessPiece("a1", "Rook", team);
			pieces[1] = new ChessPiece("b1", "Knight", team);
			pieces[2] = new ChessPiece("c1", "Bishop", team);
			pieces[3] = new ChessPiece("d1", "Queen", team);
			pieces[4] = new ChessPiece("e1", "King", team);
			pieces[5] = new ChessPiece("f1", "Bishop", team);
			pieces[6] = new ChessPiece("g1", "Knight", team);
			pieces[7] = new ChessPiece("h1", "Rook", team);
			for(int i=8;i<16;i++) {
				pieces[i] = new ChessPiece(Character.toString((char)(i+89)).concat("2"), "Pawn", team);
			}
		}
		else {
			//���� ���߿� �����ϹǷ� turn�� false�� ����
			this.turn = false;
			//ü���� ä���
			pieces[0] = new ChessPiece("a8", "Rook", team);
			pieces[1] = new ChessPiece("b8", "Knight", team);
			pieces[2] = new ChessPiece("c8", "Bishop", team);
			pieces[3] = new ChessPiece("d8", "Queen", team);
			pieces[4] = new ChessPiece("e8", "King", team);
			pieces[5] = new ChessPiece("f8", "Bishop", team);
			pieces[6] = new ChessPiece("g8", "Knight", team);
			pieces[7] = new ChessPiece("h8", "Rook", team);
			for(int i=8;i<16;i++) {
				pieces[i] = new ChessPiece(Character.toString((char)(i+89)).concat("7"), "Pawn", team);
			}
		}
		
	}
}