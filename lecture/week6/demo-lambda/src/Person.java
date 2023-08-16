public class Person implements Swimable {

  String name;

  public Person() {
    
  }

  public Person(String name) {
    this.name = name;
  }

  @Override
  public void swim(){
    System.out.println("Person is swimming");
  }

  @Override
  public String toString() {
    return "[" + this.name + "]";
  }

  public static void main(String[] args) {
    Person person = new Person();
    person.swim();
  }
}