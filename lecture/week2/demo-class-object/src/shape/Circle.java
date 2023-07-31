package shape;

public class Circle {

  public int id; // instance variable / attribute

  private double radius;

  // static -> shared variable
  // final -> one timr initialization ONLY
  private static final double pi = 3.14159;

  private static int counter;
  // calculate of circle objects being created

  public Circle () {
    this.id = AddCounter();
  }
  public int getId() {
    return this.id;
  }

  public static int AddCounter () {
    return ++counter;
  }

  public double area () {
    return Math.pow(this.radius , 2) * pi;
  }

  public double circumference() { // instance method
    return 2 * radius * pi;
  }

  public void setRadius (double radius){
    this.radius = radius;
  }


  public static void main (String[] args) {

    Circle c = new Circle(); // Constructor
    c.setRadius(2);
    c.area();
    c.circumference();





  }
  
}
