package chess

// represents the lack of a piece
class NoPiece implements IPiece {
  // returns the string representation of no piece
  public String makeString() {
    return " -";
  }

  // returns false since no piece was selected
  public boolean isLegalMove(int x, int y, int toX, int toY, Board board) {
    return false;
  }
  static constraints = {}
}
