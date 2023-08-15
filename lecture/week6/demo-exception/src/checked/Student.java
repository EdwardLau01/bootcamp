package checked;

public class Student {
  String name;
  long pocketMoney;

  public Student(String name) {
    this.name = name;
    //this.pocketMoney = pocketMoney;
  }

  public void setName(String name) throws NameTooLongException {
    if (name.length() > 10) {
      throw new NameTooLongException("Name is too long (> 10)");
    }
    this.name = name;
  }

  public void setPocketMoney(long pocketMoney) throws AmountZeroException {
    if (pocketMoney <= 0) {
      throw new AmountZeroException("Pocket Money is smaller than 0");
    }
    this.pocketMoney = pocketMoney;
  }

  public static void main(String[] args) {
    Student student = new Student("John");
    try {
      student.setName("Peter"); // if exception, throw it to the caller
      student.setPocketMoney(-3); // if exception, throw it to the caller
    } catch (NameTooLongException | AmountZeroException e) { 
      System.out.println("student setter issue, message:" + e.getMessage());
    } catch (RuntimeException e) { // 
      System.out.println(e.getMessage()); // by zero
    // } catch (Exception e) { // 
    //   System.out.println(e.getMessage()); // by zero
    } finally {
      System.out.println("finally");
    }

    Student student2 = new Student("abc");
    //mstudent2.name.length(); // null pointer, unchecked exception
  }
}
