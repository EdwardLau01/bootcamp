import java.util.List;

public class Person8 {
  private String name;

  public Person8(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }


  @Override
  public String toString() {
    return "Person(name=" + this.name //
        + ")";
  }
}
