package chess

class Pawn extends APiece {

  Pawn(boolean isWhite) {
    super(isWhite, 'P');
  }

  // returns if this pawn can move to the given coordinates legally
  public boolean isLegalMove(int x, int y, int toX, int toY, Board board) {
    return true;
  }

  // ignore this for now
  static constraints = {}
}
