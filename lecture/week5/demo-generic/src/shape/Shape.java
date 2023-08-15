package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Shape {

  abstract double area(); // implicity public

  // public <T extends Shape> double area (List<T> shapes) {
  public double area(List<? extends Shape> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    // shapes.add(new Circle()); // compile-time check, type-safe
    for (Shape shape : shapes) {
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }

  public static void main(String[] args) {
    Shape shaps = new Circle(); 
    Shape shape2 = new Square();
    ArrayList<Shape> shapes = new ArrayList<>();
    // shapes = new ArrayList<Circle>(); // Compile - error

    List<? extends Shape> list = new ArrayList<>();
    list = new ArrayList<Square>(); // OK
    // list.add(new Circle()); // compile check refer declaration

    List<Map<String, String>> list2 = new ArrayList<>();
    list2.add(new HashMap<>());
    
  }
}
