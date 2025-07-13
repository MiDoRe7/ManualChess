package chessgame;

import java.util.List;
import java.util.ArrayList;

public class ChessPiece {
	private String locate;
	private String type;
	private String team;
	private Boolean is_alive;
	
	//������
	ChessPiece(String locate, String type, String team){
		this.locate = locate;
		this.type = type;
		this.team = team;
		this.is_alive = true;
	}

	//Getter & Setter
	public String getLocate() {
		return locate;
	}

	public void setLocate(String locate) {
		this.locate = locate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getIs_alive() {
		return is_alive;
	}

	public void setIs_alive(Boolean is_alive) {
		this.is_alive = is_alive;
	}
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	// 말의 이동 
	public List<int[]> getMove() {
		List<int[]> moves = new ArrayList<>();

		switch (type) {
			case "Rook":
				int [] Rook_x = {1, -1, 0, 0};
				int [] Rook_y = {0, 0, 1, -1};

				for(int x=0; x<8; x++ ){
					for (int y=0; y<8; y++){

						for (int i=0; i<4;i++){
							for(int j=0; j<7;j++){
								int moveX = x + Rook_x[i] * j; // X좌표 이동
								int moveY = y + Rook_y[i] * j;

								moves.add(new int[] {moveX, moveY});
							}
							
						}
					}
				}
				break;
		
			case "Bishop":
				int [] Bishop_x = {1, 1, -1, -1};
				int [] Bishop_y = {1, -1, 1, -1};

				for(int x=0; x<8; x++ ){
					for (int y=0; y<8; y++){

						for (int i=0; i<4;i++){
							for(int j=0; j<7;j++){
								int moveX = x + Bishop_x[i] * j; // X좌표 이동
								int moveY = y + Bishop_y[i] * j;

								moves.add(new int[] {moveX, moveY});
							}
							
						}
					}
				}

				break;

			case "Knight":
				int [] Knight_x = {2, 2, -2, -2, 1, 1, -1, -1};
				int [] Knight_y = {-1, 1, -1, 1, -2, 2, -2, 2};

				for(int x=0; x<8; x++ ){
					for (int y=0; y<8; y++){

						for (int i=0; i<8;i++){
							int moveX = x + Knight_x[i]; // X좌표 이동
							int moveY = y + Knight_y[i];

							moves.add(new int[] {moveX, moveY});
						}
					}
				}

				break;

			case "King":
				int [] King_x = {1, -1, 1, -1, 1, -1, 0, 0};
				int [] King_y = {-1, 1, 0, 0, 1, -1, 1, -1};

				for(int x=0; x<8; x++ ){
					for (int y=0; y<8; y++){

						for (int i=0; i<4;i++){
							int moveX = x + King_x[i]; // X좌표 이동
							int moveY = y + King_y[i];

							moves.add(new int[] {moveX, moveY});
							
						}
					}
				}
				break;

			case "Queen":
				int [] Queen_x = {1, -1, 1, -1, 1, -1, 0, 0};
				int [] Queen_y = {-1, 1, 0, 0, 1, -1, 1, -1};

				for(int x=0; x<8; x++ ){
					for (int y=0; y<8; y++){

						for (int i=0; i<4;i++){
							for(int j=0; j<7;j++){
								int moveX = x + Queen_x[i] * j; // X좌표 이동
								int moveY = y + Queen_y[i] * j;

								moves.add(new int[] {moveX, moveY});
							}			
						}
					}
				}
			
				break;

			case "Pawn":
					int [] Pawn_x = {0, 0, 0, 0}; // 0과 1의 값은 흑, 2와 3의 값은 백의 이동
					int [] Pawn_y = {1, 2, -1, -2}; 
				if (this.team.equals("white")){
					
					for(int x=0; x<8; x++ ){
					for (int y=0; y<8; y++){

						for (int i=2; i<4;i++){ // 백의 이동 경로 배열부터 출력
							int moveX = x + Pawn_x[i]; // X좌표 이동
							int moveY = y + Pawn_y[i];

							moves.add(new int[] {moveX, moveY});
							
							}
						}
					}

			
				}else{
					
					for(int x=0; x<8; x++ ){
					for (int y=0; y<8; y++){

						for (int i=0; i<2;i++){
							int moveX = x + Pawn_x[i]; // X좌표 이동
							int moveY = y + Pawn_y[i];

							moves.add(new int[] {moveX, moveY});
							
							}
						}
					}

				}
				
			break;
		}

		return moves;
	}

}

