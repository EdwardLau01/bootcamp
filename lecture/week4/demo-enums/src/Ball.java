public class Ball {

  private Color color;

  public Ball() {

  }
  public Ball (Color color) {
    this.color = color;
  }

  public Color getColor(){
    return this.color;
  }

  @Override
  public String getHexCode() {
    return super.hexCode;
  }

  @Override
  public boolean equals(Object o){
    if (this == o){
      return true;
    }
    if (!(this instanceof Ball)){
      return false;
    }
    Ball ball = (Ball) o;
    return this.color == ball.color;
  }
  

  public static void main(String[] args) {
    Ball ball = new Ball(Color.RED);

    System.out.println(ball.getColor().name());



    
  }
  
}
