public class Dog extends GameMember implements Move {

  String name;

  @Override
  public void up(){
    System.out.println("Dog moving up");
    super.addScore(2);
  }

  @Override
  public void down(){
    System.out.println("Dog is down");
  }

  @Override
  public void right(){
    System.out.println("Dog is right");
  }

  @Override
  public void left(){
    System.out.println("Dog is left");
  }

  @Override
  public void jump() {
    System.out.println("Dog is jump");
    super.addScore(3);
  }

  @Override
  public void bigJump() {
    System.out.println("Dog is jump");
    super.addScore(5);
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.print(); // 
  }

}
