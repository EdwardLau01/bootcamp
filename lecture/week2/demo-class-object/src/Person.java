public class Person { // teplate
  // describe the persin by attributes
  int age;

  char gender; // week6 -> ENUM
  // .....
public static boolean isMale(char gender) { //belong to class
  if (gender == 'F') {
      return false;
    }
    return true;
}
  public boolean isMale() { // each object has this method
    if (this.gender == 'F') {
      return false;
    }
    return true;
  }

  // getter
  public int getAge() {
    return this.age;
  }

  public char getGender() {
    return this.gender;
  }

  // setter
  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public static void main(String[] args) {
    String s = "abc"; // new an object in heap
    String s2 = new String("abcd"); // new an object in heap
    String s3 = String.valueOf("abcde"); // new an object in heap
    Boolean b = new Boolean("true");
    Boolean b2 = Boolean.valueOf("false");
    Boolean b3 = true;

    Person p = new Person(); // preduce empty person object, with default value
    Person p2 = new Person(); // preduce empty person object, with default value
    p.setAge(13);
    p.setGender('M');
    System.out.println(p.getAge());
    System.out.println(p.getGender());

    // static vs non-static

    // static 
    System.out.println(Person.isMale('F')); // -> false

    // non-static
    p.setGender('M');
    p.isMale(); // true

    Computer computer = new Computer(); // public class // Computer() -> empty consructor
    computer.setColor("RED");
    computer.setRam(128);
    computer.setWeight(2);

    Computer computer2 = new Computer("BULE");
    computer2.getColor(); // -> BULE
    computer2.setColor("BLACK");
    computer2.getColor(); // -> BLACK



  }

}
