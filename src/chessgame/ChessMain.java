package chessgame;

public class ChessMain {

	public static void main(String[] args) {
		Player p1 = new Player("white", 0);
		Player p2 = new Player("black", 0);
		
		ChessPiece[] board = new ChessPiece[p1.pieces.length + p2.pieces.length];
		System.arraycopy(p1.pieces, 0, board, 0, p1.pieces.length);
		System.arraycopy(p2.pieces, 0, board, p1.pieces.length, p2.pieces.length);
		
		printBoard(board);
	}
	
	public static void printBoard(ChessPiece[] pieces) {
        //8x8 체스판 초기화 (모두 "."로 채움)
        String[][] board = new String[8][8];
        for (int r = 0; r < 8; r++)
            for (int c = 0; c < 8; c++)
                board[r][c] = ".";

        //각 체스말을 보드에 위치시킴
        for (ChessPiece piece : pieces) {
            String loc = piece.getLocate();
            int col = loc.charAt(0) - 'a';           // a~h -> 0~7
            int row = 8 - Character.getNumericValue(loc.charAt(1));  // 1~8 -> 7~0
            if (row >= 0 && row < 8 && col >= 0 && col < 8) {
                board[row][col] = getSymbol(piece.getType(), piece.getTeam());
            }
        }

        //보드 출력
        System.out.println("  a b c d e f g h");
        for (int r = 0; r < 8; r++) {
            System.out.print((8 - r) + " ");
            for (int c = 0; c < 8; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
	}
	
	public static String getSymbol(String type, String team) {
		String Symbol = null;
		switch(type) {
		case "Pawn": Symbol = team.equals("white")?"P":"p"; break;
		case "Knight": Symbol = team.equals("white")?"N":"n"; break;
		case "Bishop": Symbol = team.equals("white")?"B":"b"; break;
		case "Rook": Symbol = team.equals("white")?"R":"r"; break;
		case "Queen": Symbol = team.equals("white")?"Q":"q"; break;
		case "King": Symbol = team.equals("white")?"K":"k"; break;
		}
		
		return Symbol;
	}
}
