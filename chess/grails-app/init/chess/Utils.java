
public class Utils {
  // returns the piece, for the given coordinates, at the start of the game
  public IPiece getStartingPiece(int x, int y) {
    if (y > 1 && y < 6) {         // generate empty squares
      return new NoPiece();
    }
    else if (y == 1 || y == 6) {  // generate pawns
      return new Pawn(x, y, y == 1);
    }
    else if (x == 0 || x == 7) {  // generate rooks
      return new Rook(x, y, y == 0);
    }
    else if (x == 1 || x == 6) {  // generate knights
      return new Knight(x, y, y == 0);
    }
    else if (x == 2 || x == 5) {  // generate bishops
      return new Bishop(x, y, y == 0);
    }
    else if (x == 3) {            // generate queens
      return new Queen(x, y, y == 0);
    }
    else {                        // generate kings
      return new King(x, y, y == 0);
    }
  }
}
