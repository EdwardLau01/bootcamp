public class Student extends Adult{
  // Must implement abstract method

  public Student() {
    super();
  }

  public void sleep() {
    System.out.println("I am student, sleeping");
  }

  public void read() {
    System.out.println("I am student, reading");
  }

  public static void main(String[] args) {
    Student student = new Student();
    student.eat();
    student.read();
    student.run();
    student.sleep();
    System.out.println(student.getAge());
  }
}
