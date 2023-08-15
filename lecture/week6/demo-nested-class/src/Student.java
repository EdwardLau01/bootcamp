import java.util.List;
// Outer Class 
// can Access static nested class attribute
public class Student {
  private String name;

  private Bag bag;

  public Student() {

  }

  public Student(String name) {
    this.name = name;
    bag = new Student.Bag();
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public int getBagSize() {
    return this.bag.size;
  }

  public void clearBag() {
    Bag.clear(this.bag);
  }

  public static int add(int a, int b) {
    return a + b;
  }

  @Override
  public String toString() {
    return "Student[name=" + this.name //
        + "," + this.bag//
        + "]";
  }

  // stactic nested class
  // Cannot access Outer Class Attributes
  private static class Bag {
    int size;
    List<String> strings;

    public Bag() {

    }

    public Bag(int size) {
      this.size = size;
    }

    public void setSize(int size) {
      this.size = size;
    }

    public int getSize() {
      return this.size;
    }

    public static void clear(Bag bag) {
      bag.strings.clear();
    }

    public static void printHello() {
      Grade.printHello();
    }

    @Override
    public String toString() {
      return "Bag[size=" + this.size //
          + ", strings=" + this.strings //
          + "]";
    }

  }

  // inner class (non-static nested class)
  public class Grade {
    private int socre;

    public Grade () {

    }

    public Grade(int score) {
      this.socre = score;
    }

    public char getGrade() {
      switch (this.socre) {
        case 90:
          return 'A';
        case 80:
          return 'C';
        case 70:
          return 'D';
        default:
          return 'F';
      }
    }

    public void printStudentName() {
      System.out.println(Student.this.getName());
    }

    public static void printHello() {
      System.out.println("Hello");
    }

  }

  public static void main(String[] args) {
    Student student = new Student("john");
    Student.Bag bag = new Student.Bag();

    Student.Grade grade = student.new Grade(70);

    System.out.println(student.toString());

    grade.printStudentName();

  }
}
