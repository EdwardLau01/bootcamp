public class Demo {
  public static void main(String[] args) {
    Car car = new Car(); // empty constructor
    Car car2 = new Car(4 , 7 , "red");

    System.out.println(car2.getCapacity());
    System.out.println(car2.getColor());
    System.out.println(car2.getNoOfWheel());
    System.out.println(car2); // Car@6b95977 -> object reference adress

    // car2 = new Car( 5, 10, "yellow")
    car2.setColor("bule"); // car2 -> object reference, storing the object 
    car.setColor("yellow");

    car2 = new Car (3 , 4 , "black");
    car2 = null;
    car2 = new Car(10 , 3 , "pink");


    Person person = new Person(); // Constructor

    Computer computer = new Computer();

    String str = new String("Hello"); // str -> object reference
    str.charAt(1);
    System.out.println(str); // Hello

    CarFactory carFactory = new CarFactory();
    carFactory.changeColor(car2, "White");
    System.out.println(car2.getColor());

    


  }
  
}
