public class Student extends Person implements Runnable, Swimable, Move {

  private String name;
  private int score = 0;

  @Override
  public void run() {
    System.out.println("I am student, running");
  }

  @Override
  public void swim() {
    System.out.println("I am student, swimming");
  }

  @Override
  public void breath() {
    System.out.println("I am student, breathing");
  }

  @Override
  public void jump() {
    System.out.println("I am student, jump");
    this.score++;
  }


  public static void main(String[] args) {
    System.out.println(Move.MAX_SPEED); // 10

    // interface class
    Move move = new Student();
    Runnable run = new Student();
    Swimable swim = new Student();

    move.jump();
    // move.MAX_SPEED; // Not recommend
    int speed = Move.MAX_SPEED;

    // abstract class
    Person p1 = new Student();
    p1.breath();
    p1.getAge();

    Move dog = new Dog();
    dog.jump();
  }

}
