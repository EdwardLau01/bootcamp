public class Loops {
  public static void main(String[] args) {
    
    // For Loop
    // i++; == ++i;
    for (int i = 0; i < 4; ++i) { // for ( ; ; ; ) { }
      System.out.println("i=" + i + " Hello");

      // Logic flow:
      // i = 0  -> 0 < 4 , print 1st Hello
      // ++i -> i = 1 -> 1 < 4 , print 2nd Hello
      // ++i -> i = 2 -> 2 < 4 , print 3rd Hello
      // ++i -> i = 3 -> 3 < 4 , print 4th Hello
      // ++i -> i = 4 -> 4 is NOT SMALLER than 4 , exit loop
    }
    for (int j = 6; j > 0; j--) {
      System.out.println("j = " + j);
    }

    int max = 10;
    int total = 0;
    for (int i = 0; i < max; ++i) {
      total += i;
    }
    // total = 45

    int sum = 0;
    int sumOddNumberWithout5 = 0;
    for (int i = 0; i < 10; i++) {
      // odd numbers
      if (i % 2 == 1) {
        sum += i;
      }
      if (i % 2 == 1 && i !=5) {
        sumOddNumberWithout5 += i;
      }
      // for loop , can excute more than one action
    }
    // sum = 25
    //sumOddNumberWithout5 = 20

    for (int i = 0; i < 5; ++i) {
      System.out.println("i = " + i);
      if (i > 2){
        break;
      }
      // i = 0
      // i = 1
      // i = 2
      // i = 3
      //break
    }

  }
}
