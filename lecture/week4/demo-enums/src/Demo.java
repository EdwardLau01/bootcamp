public class Demo {
  
  public static void main (String[] args) {
    System.out.println(Direction.EAST.name());
    System.out.println(Direction.EAST);
    System.out.println(Direction.NORTH);

    Direction east = Direction.EAST;
    Direction east2 = Direction.EAST;
    System.out.println(east == east2);
    System.out.println(east == Direction.NORTH); // false
    System.out.println(east != Direction.NORTH); // true
    // == and != are checking the object reference

    //value() -> loop
    for (Direction element : Direction.values()) { // Direction.values() -> static method
      System.out.println(element.name());
    }

    // ordinal() -> index
    System.out.println(Direction.SOUTH.ordinal()); // 1
    System.out.println(Direction.EAST.ordinal()); // 0

    System.out.println(east.getDegree());
    System.out.println(east.getDirection());

    Ball ball = new Ball(Color.BULE);
    Color c1 = Color.BULE;
    System.out.println(ball.getColor());
    System.out.println(c1.getHexCode());
    System.out.println(ball.getColor().getHexCode()); // ball -> bule -> #000FF

  }
}
