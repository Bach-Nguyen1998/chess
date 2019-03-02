package chess
import java.lang.String
import java.lang.Object

interface IPiece {
  // returns the string representation of this piece
  public String makeString()

  // returns if moving this piece to the given square, on the given board, is legal
  public boolean isLegalMove(int x, int y, int toX, int toY, Board board)
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
  public String makeString() {
    return ((isWhite) ? "W" : "B") + this.name;
  }
}

