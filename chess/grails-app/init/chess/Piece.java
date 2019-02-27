

interface IPiece {
  // returns the string representation of this piece
  public String toString();
}

// represents the lack of a piece
class NoPiece implements IPiece {
  // returns the string representation of no piece
  public String toString() {
    return "  ";
  }
}

// represents a type of piece
abstract class APiece implements IPiece {

  int x;
  int y;
  boolean isWhite;
  char name;      // the one character representation of this piece
  
  APiece(int x, int y, boolean isWhite, char name) {
    this.x = x;
    this.y = y;
    this.isWhite = isWhite;
    this.name = name;
  }
  
  // moves this piece to the given x and y coordinates
  void move(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  // returns the string representation of this piece
  public String toString() {
    return ((isWhite) ? "W" : "B") + this.name;
  }
}