public class Cat extends GameMember implements Move {

  String name;

  @Override
  public void up() {
    System.out.println("Cat moving up");
    super.addScore(1);
  }

  @Override
  public void down() {
    System.out.println("Cat is down");
  }

  @Override
  public void right() {
    System.out.println("Cat is right");
  }

  @Override
  public void left() {
    System.out.println("Cat is left");
  }

  @Override
  public void jump() {
    System.out.println("Cat is jump");
    super.addScore(4);
  }

  @Override
  public void bigJump() {
    System.out.println("Cat is jump");
    super.addScore(7);
  }

}
