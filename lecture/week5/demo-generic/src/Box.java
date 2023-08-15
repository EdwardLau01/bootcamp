import java.util.ArrayList;
import java.util.Collections;

public class Box<T extends Number> {

  private ArrayList<T> numbers;

  private Box() {
    numbers = new ArrayList<>();
  }

  public Box(T number) {
    this(); // the empty contructor of Class Box
    numbers.add(number);
  }

  public ArrayList<T> getNumbers() {
    return this.numbers;
  }

  public void add(T number) {
    this.numbers.add(number); // null pointer
  }

  public int size() {
    return numbers.size();
  }

  // public void setNumbers(T[] numbers){
  // this.numbers = numbers;
  // }

  public static void main(String[] args) {
    // Box<String> box1 = new Box<> ();
    Box<Number> box1 = new Box<>(100); // compile-time check
    System.out.println(box1.size());
    // box1 = new Box<>("abc"); //new Box("abc") is not Box<Number>

    Collections
  }
}
