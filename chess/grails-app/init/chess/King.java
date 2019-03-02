
public class King extends APiece {

  King(boolean isWhite) {
    super(isWhite, 'K');
  }

  // returns if this king can move to the given coordinates legally
  public boolean isLegalMove(int x, int y, int toX, int toY, Board board) {
    return true;
  }

}
