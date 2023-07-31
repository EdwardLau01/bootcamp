public abstract class Person { 
  // abstract class - cannot new constructor
  // final class - cannot extends
  // cannot abstract final class !!!!!
  private int age;

  private double height;

  public Person() {
    
  }

  public int getAge () {
    return this.age;
  }

  public double getHeight () {
    return this.height;
  }

  // May contain instance method with implementation
  public void run() {
    System.out.println("I am running");
  }

  // May contain instance method (without implementation)
  public abstract void sleep();

}
