
public class Rook extends APiece {

  Rook(boolean isWhite) {
    super(isWhite, 'R');
  }

  // returns if this rook can move to the given coordinates legally
  public boolean isLegalMove(int x, int y, int toX, int toY, Board board) {
    return true;
  }
  
}
