package chess

@Resource(uri = '/knight')
class Knight extends APiece {
  Knight(boolean isWhite) {
    super(isWhite, 'N');
  }

  // returns if this knight can move to the given coordinates legally
  public boolean isLegalMove(int x, int y, int toX, int toY, Board board) {
    return true;
  }

  // ignore this for now
  static constraints = {}
}
