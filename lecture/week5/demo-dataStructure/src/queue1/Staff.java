package queue1;

public class Staff implements Walkable {
  @Override
  public void walk() {
    System.out.println("Staff is walking");
  }

  public static void main(String[] args) {
    Walkable person = new Staff();
    Walkable person2 = new Student();

    person.walk();
    person2.walk();

  }
}
