package chess

class Move {
  private int fromX;
  private int fromY;
  private int toX;
  private int toY;

  Move(int fromX, int fromY, int toX, int toY) {
    Utils u = new Utils();
    String message = "One or more of the coordinates are out of range";
    this.fromX = u.checkRange(fromX, 0, 7, message);
    this.fromY = u.checkRange(fromY, 0, 7, message);
    this.toX = u.checkRange(toX, 0, 7, message);
    this.toY = u.checkRange(toY, 0, 7, message);
  }

  public int getFromX() {
    return fromX;
  }

  public int getFromY() {
    return fromY;
  }

  public int getToX() {
    return toX;
  }

  public int getToY() {
    return toY;
  }

  // ignore this for now
  static constraints = {}
}
