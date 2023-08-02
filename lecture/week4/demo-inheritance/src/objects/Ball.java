package objects;

import java.util.Objects;

public class Ball {

  private String color;

  public Ball(String color) {
    this.color = color;
  } 

  public Ball () {
  }

  @Override
  public String toString(){
    return "[color=" + this.color + "]";
  }

  @Override
  public int hashCode(){
    //hashCode is not unique representation of object reference
    return Objects.hash(this.color);
  }

  @Override
  public boolean equals(Object o) { // instance method
    //if address same, valur inside the object must be same
    if (this == o) {
      return true;
    }
      if(! (o instanceof Ball)) {
        return false;
      }
      Ball ball = (Ball) o;
      return Objects.equals(ball.color , this.color);
      // return ball.color.equals(this.color); // bug // ball maybe null
    }

  public static void main(String[] args) {
    Ball ball1 = new Ball("Bule"); // address 1
    Ball ball2 = new Ball("Bule"); // address 2
    System.out.println(ball1);

    System.out.println(ball1 == ball2); // false
    System.out.println(ball1.equals(ball2)); // true, checking color, instead of memory
    System.out.println(ball1); // [color=Bule]


  

  }
}
