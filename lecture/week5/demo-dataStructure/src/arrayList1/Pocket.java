package arrayList1;
import java.util.ArrayList;

public class Pocket {

  ArrayList<Ball2> balls; // attribute

  public Pocket() {
    this.balls = new ArrayList<>();
  }
  public boolean isFull() {
    return this.balls.size() >= 5;
  }

  public void add(Ball2 ball) {
    // if number of ball >= 5, remove the 1 st(idx = 0), and add
    // if(this.balls.size() >= 5) {
    //   this.balls.remove(0);
    // }
    this.balls.add(ball);
  }

  public void removeFirstBall() {
    this.balls.remove(0); 
  }


  public void remove(Ball2 ball) {
    this.balls.remove(ball); // first occurrence
  }

  public void remove(int ballId) { // Overloading
    for (Ball2 b : this.balls) {
      if (b.getId() == ballId) { // premitive
        this.balls.remove(b);
        return; // remove the first one and return
      }
    }
  }

  public int getSize() {
    return this.balls.size();

  }

  public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for(Ball2 b : this.balls) {
      sb.append(b);
      sb.append(",");
    }
    sb.append("]");
    return sb.toString();
  }

  public int totalScore() {
    int sum = 0;
    for (Ball2 ball : this.balls){
      sum += ball.getScore();
    }
    return sum;
  }
}
