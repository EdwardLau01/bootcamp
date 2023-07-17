public class excerise {
  public static void main(String[] args) {

    for (int i = 0; i < 100; i++) {
      System.out.println((i + 1) + " ");
    }
    int count = 0;
    for (int i = 0; i >= 0; i++) {
      if (i % 2 == 0 && i != 0) {
        System.out.println(i);
        count++;
      }
      if (count == 10) {
        break;
      }
    }

    int count2 = 0;
    for (int i = 0; i >= 0; i++) {
      if (i % 2 == 1 && i != 0) {
        System.out.println(i);
        count2++;
      }
      if (count2 == 10) {
        break;
      }
    }
    int sum = 0;
    for (int i = 0; i < 100; i++) {
      sum += (i + 1);
    }
    System.out.println("sum is " + sum);

    int a = 1;
    int b = 1;
    int c = 0;
    for (int i = 0; i < 10; i++) {
      c = a + b;
      System.out.println(a);
      a = b;
      b = c;
    }
    
  }

}
