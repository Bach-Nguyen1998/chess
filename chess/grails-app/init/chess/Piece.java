

interface IPiece {
  // returns the string representation of this piece
  public String toString();

  // returns if moving this piece to the given square, on the given board, is legal
  public boolean isLegalMove(int x, int y, int toX, int toY, Board board);
}

// represents the lack of a piece
class NoPiece implements IPiece {
  // returns the string representation of no piece
  public String toString() {
    return " -";
  }

  // returns false since no piece was selected
  public boolean isLegalMove(int x, int y, int toX, int toY, Board board) {
    return false;
  }
}

// represents a type of piece
abstract class APiece implements IPiece {

  boolean isWhite;
  char name;      // the one character representation of this piece
  
  APiece(boolean isWhite, char name) {
    this.isWhite = isWhite;
    this.name = name;
  }
  
  // returns if this piece can move to the given coordinates based
  // on the given board
  public abstract boolean isLegalMove(int x, int y, int toX, int toY, Board board);
  
  // returns the string representation of this piece
  public String toString() {
    return ((isWhite) ? "W" : "B") + this.name;
  }
}