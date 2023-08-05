public class Ball {

  private Color color;

  public Ball() {

  }
  public Ball (Color color) {
    this.color = color;
  }

  public Color getColor(){
    return this.color;
  }

  @Override
  public String getHexCode() {
    return super.hexCode;
  }

  @Override
  public boolean equals(Object o){
    if (this == o){
      return true;
    }
    if (!(this instanceof Ball)){
      return false;
    }
    Ball ball = (Ball) o;
    return this.color == ball.color;
  }
  

  public static void main(String[] args) {
    Ball ball = new Ball(Color.RED);

    System.out.println(ball.getColor().name());

    Object object = new Ball(Color.RED); // object is reference
    // complie-time Class "Object" type check
    object.hashCode(); // reference presentation
    // Compile-time : check if Object class has hashCode() method
    // Compile-time : check if Ball class inherit Object

    // Run-time : object variable stores an address, point Ball object in heap
    // Run-time : determine if Ball class has hashCode() method
    // If no, then invoke Class Object hashCode(
    // If yes, invoke the Class Ball hashCode()
    if(((Ball)object) instanceof Ball){
    System.out.println(((Ball)object).getColor()); // Complie-time type checking
    }
    Color color = ((Ball)object).getColor();

    // Color extends Enum.class. Enum extends Object
    Class<?> clas = color.getClass();
    System.out.println(clas.getName()); // Color

    if(Color.BLUE instanceof Color) { // true
      System.out.println("Color.BLUE is instanceof Color");
    }

    if(Color.BLUE.getClass() == Color.class) { // true
      System.out.println("Color.BLUE is instanceof Color");
    }

    Object o = 1 - 'a'; // int 
    System.out.println(o.getClass().getName()); // java.lang.Integer

    Object o2 = 'a';
    System.out.println(o2.getClass().getName()); // java.lang.Character

    Object o3 = new Ball(Color.GREEN);
    System.out.println(o3.getClass().getName()); // Ball

    System.out.println(o3.getClass().isEnum()); // false
    System.out.println(((Ball)o3).getColor().getClass().isEnum()); // true
    System.out.println(clas.isEnum()); // true





    

  }




    
  }
