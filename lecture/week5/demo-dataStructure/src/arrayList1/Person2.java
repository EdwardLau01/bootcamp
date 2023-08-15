package arrayList1;
public class Person2 implements Player {

  // Pocket leftPocket;
  // Pocket rightPocket;

  Pocket[] pockets;

  int score;

  public Person2() {
    pockets = new Pocket[] { new Pocket(), new Pocket() };
  }

  @Override
  public int totalScore() {
    return this.getLeftPocket().totalScore() //
        + this.getRightPocket().totalScore();
  }

  public Pocket getLeftPocket() {
    return this.pockets[0];
  }

  public Pocket getRightPocket() {
    return this.pockets[1];
  }

  public static void main(String[] args) {

    Person2 p1 = new Person2();
    Player.fillThePocket(p1.getLeftPocket());
    Player.fillThePocket(p1.getRightPocket());
    System.out.println(p1.getLeftPocket().getSize()); // 5
    System.out.println(p1.getRightPocket().getSize()); // 5

    System.out.println("p1 Total Score:" + p1.totalScore());

    System.out.println( //
        "p1 LeftPocket Balls:" + p1.getLeftPocket().toString());
    System.out.println( //
        "p1 RightPocket Balls:" + p1.getRightPocket().toString());

    Person2 p2 = new Person2();
    Player.fillThePocket(p2.getLeftPocket());
    Player.fillThePocket(p2.getRightPocket());

  }

}
