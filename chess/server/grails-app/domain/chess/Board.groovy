package chess
import java.util.ArrayList;

//  represents the board on which Chess is played
class Board {
  final int BOARD_WIDTH = 8;
  ArrayList<ArrayList<Square>> board;

  Board() {
    this.setStartingPostion();
  }

  Board(ArrayList<ArrayList<Square>> board) {
    this.board = board;
  }
  // sets this board to the starting position of a game of chess
  private void setStartingPostion() {
    board = new ArrayList<ArrayList<Square>>();
    for(int i = 0; i < BOARD_WIDTH; ++i) {
      ArrayList<Square> row = new ArrayList<Square>();
      for(int j = 0; j < BOARD_WIDTH; ++j) {
        row.add(new Square(i, j, new Utils().getStartingPiece(i, j)));
      }
      this.board.add(row);
    }
  }
  // updates the board based on the given move
  public void handleMove(Move m) {
    Square fromSquare = board.get(m.getFromX()).get(m.getFromY());
    Square toSquare = board.get(m.getToX()).get(m.getToY());
    if (fromSquare.isLegalMove(m.getToX(), m.getToY(), this)) { // checks if the move is legal
      toSquare.setPiece(fromSquare.piece);                      // sets the piece to its new square
      fromSquare.setPiece(NoPiece.newInstance());                       // sets the old square to no piece
    }
  }

  // returns the string representation of this board
  public String toString() {
    String s = "";
    for(int i = 0; i < BOARD_WIDTH; ++i) {
      for(int j = 0; j < BOARD_WIDTH; ++j) {
        s += " " + board.get(i).get(j).toString();
      }
      s += '\n';
    }
    return s;
  }
 
   // ignore this for now
  static constraints = {}

}

// TODO: move this to the seperate unit test class
/*class ExamplesBoard {

  Board b;
  Move m1, m2, m3, m4, m5, m6;

  void initData() {
    b = new Board();
    m1 = new Move(4, 0, 4, 2); // Ke3 (illegal)
    m2 = new Move(0, 1, 0, 2); // a3  (legal)
    m3 = new Move(1, 1, 1, 3); // b4  (legal)
    m4 = new Move(0, 0, 0, 1); // Ra2 (legal)
    m5 = new Move(1, 0, 2, 2); // Nc3 (legal)
    m6 = new Move(2, 0, 1, 1); // Bb2 (legal)
  }

  void testMove(Tester t) {
    this.initData();
    b.handleMove(m1);
    b.handleMove(m2);
    b.handleMove(m3);
    b.handleMove(m4);
    b.handleMove(m5);
    b.handleMove(m6);
    System.out.println(b);
  }
}
*/

