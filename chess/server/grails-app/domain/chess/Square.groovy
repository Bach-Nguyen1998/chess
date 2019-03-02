package chess

class Square {
  int x;
  int y;
  IPiece piece;

  Square(int x, int y, IPiece piece) {
    this.x = x;
    this.y = y;
    this.piece = piece;
  }

  // sets this piece to the given piece
  public void setPiece(IPiece piece) {
    this.piece = piece;
  }

  // returns if the piece on this square can move to the given coordinates legally
  public boolean isLegalMove(int toX, int toY, Board board) {
    return piece.isLegalMove(this.x, this.y, toX, toY, board);
  }

  // returns the string representation of this square
  public String toString() {
    return this.piece.toString();
  }
  // ignore this for now
  static constraints = {}
}
