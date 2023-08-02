package shapes;

import java.math.BigDecimal;

public abstract class Shape {

  public abstract double area();

  public static void main(String[] args) {
    double total = 0.0d;
    BigDecimal b = BigDecimal.valueOf(total);

    b.add(BigDecimal.valueOf(5));
    System.out.println(b.doubleValue()); // 0.0

    b = b.add(BigDecimal.valueOf(5));
    System.out.println(b.doubleValue()); // 5.0

    double d = 0.1d;
    System.out.println(Math.pow(d , 2)); // 0.010000000000000002

    d = 0.2d;
    System.out.println(Math.pow(d , 2)); // 0.04000000000000001

    d = 0.3d;
    System.out.println(Math.pow(d , 2)); // 0.9


    //Shapes area() example
    Circle10 circle = new Circle10(10.0d);
    Square10 square = new Square10(3.0d);
    Shape[] shapes = new Shape[] {circle , square};
    System.out.println(Shape.area(shapes));
  }

  public static double area(Shape[] shape) {
    BigDecimal total = BigDecimal.valueOf(0);
    for(Shape s : shape) {
      total = total.add(BigDecimal.valueOf(s.area()));
    }
    return total.doubleValue();
  }
}
