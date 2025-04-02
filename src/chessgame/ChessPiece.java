package chessgame;

public abstract class ChessPiece {
	String locate;
	Boolean is_alive;
	
	ChessPiece(String locate){
		this.locate = locate;
		this.is_alive = true;
	}
	
	abstract String[] cal_move(); //���� ���� ������ �� �ִ� ������ ����ϴ� �Լ�
}