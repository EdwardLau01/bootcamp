import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByColor implements Comparator<Ball>{
  
  @Override
  public int compare(Ball b1, Ball b2){
    return b2.color.id < b1.color.id ? 1 : -1;
  }

  public static void main(String[] args) {
    ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(4, Color.BLUE));
        balls.add(new Ball(1, Color.RED));
        balls.add(new Ball(2, Color.YELLOW));
        balls.add(new Ball(3, Color.YELLOW));
        
        Collections.sort(balls, new SortByColor());
        System.out.println(balls); // 
        //[[id=1, color=RED], [id=4, color=BLUE], [id=3, color=YELLOW], [id=2, color=YELLOW]]
  }



  
}
