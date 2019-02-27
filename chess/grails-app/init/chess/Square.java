
// represents a square on a chess board
public class Square {

  int x;
  int y;
  IPiece piece;
  
  Square(int x, int y, IPiece piece) {
    this.x = x;
    this.y = y;
    this.piece = piece;
  }
  
  public String toString() {
    return this.piece.toString();
  }
}
