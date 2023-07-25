public class Student {
  // State / Instance Variables
  String firstName;
  String lastName;
  int age;

  public Student(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;

  }

  public String getFulName() {
    return this.firstName.concat(" ").concat(this.lastName);
  }

    public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public boolean isAdult() {
    // if(this.age >= 18){
    //   return true;
    // }
    return this.age >= 18;
  }

  public int getAge() {
    return this.age;
  }

  public void setFristName(String firstName){
    this.firstName = firstName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public void setAge(int age){
    this.age = age;
    }

    }




