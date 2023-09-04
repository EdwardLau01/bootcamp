public class Student<T extends Number> {
  T data;
  // public class Student {
  //    Integer data;
  public static void main(String[] args) {
    Student<Integer> student = new Student<>();
    Student.getThings(2);
  }

  public T getData(){
    return this.data;
  }

  public static <S> S getThings (S data) {
    return data;
  }
  
}
