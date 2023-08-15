package arrayList1;
public enum Color2 {
  RED(100), //
  BLUE(200), //
  YELLOW(300), //
  ;

  private int score;

  private Color2(int score) {
    this.score = score;
  }

  public int getScore() {
    return this.score;
  }

  public static Color2 getColor(int id) {
    if (id < 0 || id > 2) {
      return null;
    }
    switch (id) {
      case 0:
        return Color2.RED;
      case 1:
        return Color2.BLUE;
      case 2:
        return Color2.YELLOW;
    }
    return null;
  }

}
