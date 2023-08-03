public class Demo {

  public static void main(String[] args) {
    // Dynamic Polymorphism (Run-time)
    Building building = new House();
    // Complie-time checks
    // building.getCapacity(); // compile error, Building class dose not has
    // getCapacity()

    building.print(); // I am House --- @Override
    // compile-time : confirm you can call print() method, because Building class
    // has print()
    // Run-time : decide which print() is going to call
    // So, "building" variable call House's print() method

    building.print2(); // I am House --- call this.print() --- House.print()
    building.print3(); // I am Building

    // static polymorphism (compile-time)
    // Method Signature (methid + parameters)
    // Constructor Signature
    House house = new House();
    house.print("hello");
    house.print();
    House house2 = new House(3.0d);
    house2.print("hello");
    house2.print();
    // House house3 = new House("String"); // Constructor not found
    // house2.print(3L); // print(Long) not found

    long l1 = Long.valueOf(1L); // wrapper class -> unbox
    Long l10 = 1L; // wrapper class -> auto box

    long l2 = 2; // upcast
    int i2 = (int) 3L; // downcast

    // downcast (Run-time polymorphism)
    Object obj = new Container();
    // Cube cube3 = new Container(); // Up to down , msut use (Cube)new Container
    // Cube cube4 = new Clone(); // same level cannot 
    Cube cube5 = (Cube)new Container();
    Container container6 = new Cube();
    Container container7 = new Clone();
    if (obj instanceof Cube) { // false
      Cube cube = (Cube) obj; // downcast : object -> cube
    }

    Object obj2 = new Cube();
    if (obj instanceof Container) { // true
      Container container = (Container) obj2; // downcast : object -> cube
    }

    Object obj3 = new Clone();
    // Cube cube2 = (Cube) obj3; // java.lang.ClassCastException
    // run exception: Run-time polymorphism

    Number number = Integer.valueOf(3);
    // Double d1 = (Double) number; // java.lang.ClassCastException

  }

}
