import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;

public class Superman implements Flyable {

  @Override
  public void fly() {
    System.out.println("I am flying");
  }
  public static void main(String[] args) {
    // 3 way to new a fltable object
    // 1.
    Flyable superman = new Superman();

    // 2.
    Flyable superman2 = new Flyable() {
      @Override
      public void fly() {
        System.out.println("I am Anonymous");
      }
    };

    // 3.
    Flyable superman3 = () -> System.out.println("I am Lambda");
    
    Optional<String> string = Optional.ofNullable("abc");
    // int sum = 0;
    string.ifPresent(e -> {
      // sum++;
      // String s = "";
    });
    // s = s + "hello"; 
    int total = 0;
    if (string.isPresent()) {
      total++;
      String s = "";
    }
    // s = s + "";

    int t = 0;
    Arrays.asList(1,2,3,4).stream() //
    .count(); // 4

  }

  public static double add(double a, double b) {
      return BigDecimal.valueOf(a).add(BigDecimal.valueOf(b)).doubleValue();
    }
    
}
