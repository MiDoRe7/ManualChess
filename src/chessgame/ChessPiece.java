package chessgame;

public class ChessPiece {
	private String locate;
	private String type;
	private String team;
	private Boolean is_alive;
	
	//»ý¼ºÀÚ
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
}