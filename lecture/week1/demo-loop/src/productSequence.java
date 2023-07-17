public class productSequence {
  public static void main(String[] args) {

    // 0, 1, 2, 3, 4, 5.........
    // print out 0, 2, 6, 12, 20.......

    int k = 0;
    for (int i = 0; i >= 0; i++) {
      System.out.println(i * (i + 1));
      k++;
      if (k == 20) {
        break;
      }
    }
    System.out.println("_____________");

    int j = 1;
    int o = 0;
    for (int i = 0; i >= 0; i++) {
      System.out.println(i * j++);
      o++;
      if (o == 20) {
        break;
      }
    }


    int a, b; // declare 2 vaiables in one go
    for (int i = 0; i < 20; i++) {
      a = i;
      b = i + 1;
      // c = a * b
      System.out.print(a * b + " "); // System.out.print(c + " ");
    }
    System.out.println("");

    for (int i = 0; i < 6;i++) {
      System.out.print((i * (i + 1)) + " ");
    }

  }

}
