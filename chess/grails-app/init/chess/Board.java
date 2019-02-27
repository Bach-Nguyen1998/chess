import tester.Tester;
import java.util.ArrayList;

// represents the board on which Chess is played
public class Board {

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
}

class ExamplesBoard {
  
  Board b = new Board();
  
  void testToString(Tester t) {
    System.out.print(b.toString());
  }
}
