package objects;

import shapes.Circle10;
import shapes.Shape;

public class ObjectDemo {
  // Rule 1 : All class extends Object implicitly
  String name = "hello";

  // @Override
  // public String toString () {
  // return this.name;
  // }

  public static void main(String[] args) {
    // Example 1 : Object extends Object

    ObjectDemo objectDemo = new ObjectDemo();
    // hash code -> int
    objectDemo.hashCode(); // another presentation of object refernce
    // Because hash codenhas a short range of value storage
    // so, it cannot store all memory addsress (object reference) in your machine

    int[] arr = new int[] { 1, 2, 3 };
    System.out.println(arr); // [I@6b95977

    String str = "abc";
    System.out.println(objectDemo);
    System.out.println(objectDemo.toString());

    System.out.println("abc hashcode() = " + str.hashCode()); // 96354

    // a * 31^2 + b * 31^1 + c
    System.out.println(97 * (int) Math.pow(31, 2) + 98 * 31 + 99);

    Integer i1 = 3;
    System.out.println(i1.hashCode()); // 3

    Long l1 = 100L;
    System.out.println(l1.hashCode()); // 100 // will overflow, becasuse use int to store

    ObjectDemo a = new ObjectDemo();
    ObjectDemo b = new ObjectDemo();

    System.out.println(a); // toString() -> hashcode
    System.out.println(b); // toString() -> hashcode
    System.out.println(a == b); // address (object reference)

    // equals()
    String s1 = "abc";
    String s2 = "abc";
    System.out.println(s1.equals(s2)); // true

    // instanceOf , Object.class
    Object obj = new String("abc");
    
    Shape shape = new Circle10(5.0d);
    // shape.print(); // no print() method in shape
    // Hide child print() method
    shape.area();
    Circle10 c = (Circle10) shape;
    c.print();
    System.out.println(c.getRadius());
    System.out.println(c instanceof Shape); // true

    System.out.println(obj instanceof String); // true
    obj = Long.valueOf(10);
    System.out.println(obj instanceof String); // false
    System.out.println(obj instanceof Long); // true

    // Number
    Integer int1 = Integer.valueOf(100);
    System.out.println(int1 instanceof Number); // true

    Double d1 = Double.valueOf(100);
    System.out.println(d1 instanceof Number); // true

  
    // Primitives, for camparsion, we use ==
    // Wrapper Class, for camparsion, we use .equals()
    Integer j1 = 128;
    Integer j2 = 128;
    System.out.println(j1.equals(j2));
    j1 = 127;
    j2 = 127;
    System.out.println(j1.equals(j2));
    Boolean bool1 = false;
    Boolean bool2 = false;
    System.out.println(bool1.equals(bool2));

    System.out.println(bool1.equals(false));


  }
}
