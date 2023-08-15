package hashset1;

import java.util.HashSet;

public class DemoHashSet {

  public static void main(String[] args) {

    //E HashSet is good at handing duplicate
    HashSet<String> strings = new HashSet<>();
    System.out.println(strings.add("abc")); // true
    System.out.println(strings.add("def")); // true
    System.out.println(strings.size()); // 2

    // hashset
    boolean result = strings.add("abc");
    System.out.println(strings.size()); // 2
    System.out.println(result);

    if (strings.add("def")) { // false
      System.out.println("def is added");
    } else {
      System.out.println("def is not added");
    }

    // example 2 : wtith override equals()
    HashSet<Coordinate> coordinates = new HashSet<>();
    Coordinate c1 = new Coordinate(1, 1);
    Coordinate c2 = new Coordinate(1, 1);
    System.out.println(coordinates.add(c1)); // true
    System.out.println(coordinates.add(c2)); // false, Coordinate.java
    // HashSet add() -> Coordinate c2.equals(any of coordinates in hashset)
    //               -> c2.equals(c1) -> true
    //               -> HashSet not allow duplicates
    //               ->  return false
    System.out.println(coordinates.size()); // 1

    
    Coordinate c3 = new Coordinate(2, 1);
    System.out.println(coordinates.add(c3)); // true
    System.out.println(coordinates.size()); // 2

    // example 3 : wtithout override equals()
    HashSet<Book> books = new HashSet<>();
    System.out.println(books.add(new Book("ben"))); // true
    System.out.println(books.add(new Book("ben"))); // true, , diff address
    System.out.println(books.add(new Book("tom"))); // true, diff address
    books.equals(books);


  }
}
