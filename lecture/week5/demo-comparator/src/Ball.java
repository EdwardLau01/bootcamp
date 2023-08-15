public class Ball implements Comparable<Ball> {
  int id;
  Color color;

  public Ball(int id, Color color) {
    this.id = id;
    this.color = color;
  }

  public int getId(){
    return this.id;
  }

  public Color getColor(){
    return this.color;
  }

  @Override
  public int compareTo(Ball ball) {
    // 1 -> means you want put ball to left
    // -1 -> means you want put this to left
    return this.id < ball.id? 1 : -1;
  }

  @Override
  public String toString() {
    return "[id=" + this.id //
        + ", color=" + this.color //
        + "]";
  }
}
