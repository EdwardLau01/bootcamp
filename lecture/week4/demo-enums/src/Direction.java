public enum Direction { // special keyword since Java 1.5
  // 1. public enum Direction //mean public class Direction extends Enum
  // So cannot extends
  // 2. enum is final class

  // enum is 全局唯一 , user cannot new 
  // new Direction("E")
  EAST('E', 90), //
  SOUTH('S', 180), //
  WEST('W', 270), //
  NORTH('N', 360) // or NORTH, or NORTH;
  ;

  private char direction;
  private int degree;

  private Direction(char direction, int degree) {
    this.direction = direction;
    this.degree = degree;
  }

  public char getDirection() {
    return this.direction;
  }

  public int getDegree() {
    return this.degree;
  }

  public boolean isOppsite(Direction direction){
    return Math.abs(this.degree - direction.getDegree()) == 180;
  }

  // public void setDirection(char direction) {
  //   this.direction = direction;
  // }

  public static void main(String[] args) {
    System.out.println(Direction.EAST.isOppsite(Direction.WEST)); // ture
    System.out.println(Direction.WEST.isOppsite(Direction.EAST)); //true
    System.out.println(Direction.EAST.isOppsite(Direction.NORTH)); // false
  }
  
}
