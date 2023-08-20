public record Person1(String name, int age) implements TestInterface{

  // Immutable Objects
  // final class , support Generics <T>
  //support interface, but cannot further extend (extends othe Objects)
  // private final String name;
  // private final int age;
  // No empty contructor, Only a all-args contructor
  // ALL getters
  // No Setter (final instance variable)
  // custom static methods
  // cutom constat
  // custom instance methods
  // Already @Override equals(), hashCode(), toString()

  // int salary = 0; cannot declare non-static in record

  static int counter = 0;

  static final int MAX_VALUE = 100;

  public boolean isElderly(int age) {
    return age >= 65;
  }

  public static int add(int x, int y) {
    return x + y;
  }

}
