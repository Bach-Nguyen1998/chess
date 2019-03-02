package chess

@Resource(uri = '/bishop')
class Bishop extends APiece{
  Bishop(boolean isWhite) {
    super(isWhite, 'B');
  }

  // returns if this bishop can move to the given coordinates legally
  public boolean isLegalMove(int x, int y, int toX, int toY, Board board) {
    return true;
  }

  // ignore this for now
  static constraints = {}
}
