package chess

@Resource(uri = '/queen')
class Queen extends APiece{

 Queen(boolean isWhite) {
    super(isWhite, 'Q');
  }

  // returns if this queen can move to the given coordinates legally
  public boolean isLegalMove(int x, int y, int toX, int toY, Board board) {
    return true;
  }

  // ignore this for now
  static constraints = {}
}
