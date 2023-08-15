package arrayList1;
import java.util.Objects;
import java.util.Random;

public class Ball2 {
  private int id;
  private Color2 color;
  private static int idCounter = 0;

  public Ball2(Color2 color) {
    this.id = ++idCounter;
    this.color = color;
  }

  public int getScore() {
    return this.color.getScore();
  }

  public int getId() {
    return this.id;
  }

  public static Ball2 random() {
    // get random Color
    int random = new Random().nextInt(3); //
    Color2 color = Color2.getColor(random);
    return new Ball2(color);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Ball2)) {
      return false;
    }
    Ball2 ball = (Ball2) o;
    return this.id == ball.id //
        && this.color == ball.color;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.color);
  }

  @Override
  public String toString() {
    return "[" + this.id + "]" + this.color + "," + this.color.getScore();
  }

}
