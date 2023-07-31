public class Machine {

  private double weight;

  public Machine(double weight) {
    this.weight = weight;
  }

  public Machine() {

  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getWeight() {
    return this.weight;
  }

  public void start() {
    System.out.println("Machine start...");
  }

  public void stop() {
    System.out.println("Machine stop...");

  }

  public static final String staticMethod(String x, String y) {
    return x + y;
  }

  // Factory Pattern superclass can recall all subclass
  public static Machine produce(int code) {
    switch (code) {
      case 1:
        return new Machine();
      case 2:
        return new Laptop();
    }
    return new Machine();
  }

  public static void stop(int code) {
    Machine machine = Machine.produce(code);
    machine.stop();
  }

  public static void main(String[] args) {
    Machine machine1 = Machine.produce(1); // Machine
    machine1.stop();
    Machine machine2 = Machine.produce(2); // Laptop
    machine2.stop();
    //***************/
    boolean stopCondition = 3 > 2; // ???

    if (stopCondition) {
      Machine.stop(2); // Machine stop.....
    }

  }

}
