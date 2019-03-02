package chess

class Utils {
 // returns the piece, for the given coordinates, at the start of the game
  public IPiece getStartingPiece(int x, int y) {
    if (y > 1 && y < 6) {         // generate empty squares
      return new NoPiece();
    }
    else if (y == 1 || y == 6) {  // generate pawns
      return new Pawn(y == 1);
    }
    else if (x == 0 || x == 7) {  // generate rooks
      return new Rook(y == 0);
    }
    else if (x == 1 || x == 6) {  // generate knights
      return new Knight(y == 0);
    }
    else if (x == 2 || x == 5) {  // generate bishops
      return new Bishop(y == 0);
    }
    else if (x == 3) {            // generate queens
      return new Queen(y == 0);
    }
    else {                        // generate kings
      return new King(y == 0);
    }
  }
 // returns the given int if within the given range(inclusive);
  // otherwise throws an illegal argument exception
  // with the given message
  int checkRange(int x, int low, int high, String message) {
    if (x >= low && x <= high) {
      return x;
    }
    else {
      throw new IllegalArgumentException(message);
    }
  }

  // ignore this for now
  static constraints = {}
}
