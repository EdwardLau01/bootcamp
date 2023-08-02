public class Cow implements Move {


  @Override
  public void jump() {
    System.out.println("Cow is jump");
  }

  @Override
  public void bigJump() {
    System.out.println("Cow is jump");
  }

  @Override
  public void print() { // intance method , implicitly public
    System.out.println("I am Java 8 Cow");
  }

  
}
