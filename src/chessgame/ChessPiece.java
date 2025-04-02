package chessgame;

public abstract class ChessPiece {
	String locate;
	Boolean is_alive;
	
	ChessPiece(String locate){
		this.locate = locate;
		this.is_alive = true;
	}
	
	abstract String[] cal_move(); //현재 말이 움직일 수 있는 범위를 계산하는 함수
}