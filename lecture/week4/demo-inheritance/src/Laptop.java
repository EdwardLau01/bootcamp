public class Laptop extends Machine {
  // laptop is subclass(child) , Machine is superclass(parent)
  // Inherit Machine attribute ("double weight")
  // Inherit Machine methods (start() and top())

  // double weight;
  private Keyboard keyboard;
  private Monitor monitor;
  private int volume;

  // subclass must call superclass empty constructor
  public Laptop() {
    // super(); // new Machine
    // implicitly call superclass empty constructor
    // new Machine()
  }

  public Laptop(Keyboard keyboard, Monitor monitor) {
    // implicitly call superclass empty constructor
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  public Laptop(String buttonType, int noOfButton, double length, double width) {
    // implicitly call superclass empty constructor
    this.keyboard = new Keyboard(buttonType, noOfButton);
    this.monitor = new Monitor(length, width);
  }

  public Laptop(double weight, Keyboard keyboard, Monitor monitor) {
    // supercalss must be frist
    super(weight); // = super(); + this.setWeight(weight) // new Machine(double weight); 
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  @Override // Method Overriding
  public void start() {
    super.start();
    System.out.println(("Laptop start..."));
  }

  @Override // Method Overriding
  public void stop() {
    System.out.println(("Laptop staop..."));
  }

  public void mute() {
    this.volume = 0;
  }
  // you cannot override the final method
  // public static final String statiMmethod (String x, String y){

  // }

  public static void main(String[] args) {
    Laptop laptop = new Laptop("abc", 100, 15, 10);
    laptop.setWeight(3.0d);
    System.out.println(laptop.getWeight());
    laptop.start();
    laptop.stop();

    Machine machine = new Machine();
    machine.setWeight(5.0d);
    System.out.println(machine.getWeight());
    machine.start();
    machine.stop();

    Keyboard k1 = new Keyboard("ABCDE", 100);
    Monitor m1 = new Monitor(10.0d, 20.0d);

    Laptop l1 = new Laptop(30.0d, k1, m1);

    Laptop laptop2 = new Laptop();
    laptop2.setWeight(10.0d);
    System.out.println(laptop2.getWeight());

    Laptop laptop3 = new Laptop();
    System.out.println(laptop3.getWeight());
    System.out.println(Machine.staticMethod("abc", "def"));
    System.out.println(Laptop.staticMethod("abc", "def"));
    // laptop3.staticMethod("abc", "def"); // not recommend

  }
}
