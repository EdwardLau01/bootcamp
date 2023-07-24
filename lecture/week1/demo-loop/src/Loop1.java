public class Loop1 {
  public static void main(String[] args) {

    // For Loop
    // i++; == ++i;
    for (int i = 0; i < 4; ++i) { // for ( ; ; ; ) { }
      System.out.println("i=" + i + " Hello");

      // Logic flow:
      // i = 0 -> 0 < 4 , print 1st Hello
      // ++i -> i = 1 -> 1 < 4 , print 2nd Hello
      // ++i -> i = 2 -> 2 < 4 , print 3rd Hello
      // ++i -> i = 3 -> 3 < 4 , print 4th Hello
      // ++i -> i = 4 -> 4 is NOT SMALLER than 4 , exit loop
    }
    for (int j = 6; j > 0; j--) {
      System.out.println("j = " + j);
    }
//************************************************************
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
      if (i % 2 == 1 && i != 5) {
        sumOddNumberWithout5 += i;
      }
      // for loop , can excute more than one action
    }
    // sum = 25
    // sumOddNumberWithout5 = 20

    for (int i = 0; i < 5; ++i) {
      System.out.println("i = " + i);
      if (i > 2) {
        break;
      }
      // i = 0
      // i = 1
      // i = 2
      // i = 3
      // break
    }

    // continue
    for (int i = 0; i < 6; i++) {
      System.out.println("Hello");
      if (i > 3) {
        continue; // go to the next iteration
      }
      System.out.println("Bye");
    }
    // i = 0, hello, bye
    // i = 1, hello, bye
    // i = 2, hello, bye
    // i = 3, hello, bye
    // i = 4, hello
    // i = 5, hello
    // i = 6, exit

    for (int i = 0; i > 8; i++) {
      if (i % 2 == 0 && i % 3 == 0) {
        System.out.println("i=" + 1);
      }
    }

    // Nested Loop
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("hello!");
      }
      // How many hello ?
      // i = 0, j = 0 , hello
      // i = 0, j = 1 , hello
      // i = 0, j = 2 , hello
      // i = 0, j = 3 , exit
      // i = 1, j = 0 , hello
      // i = 1, j = 1 , hello
      // i = 1, j = 2 , hello
      // i = 1, j = 3 , exit
      // .....
      // i = 5, j = 0 , exit outer loop
    }

    System.out.println("____________");
    // *
    // **
    // ***
    // *****
    // ******
    // System.out.println(); -> nextline after print out
    // System.out.print(); -> continue after print out, no next line
    
    // for (int l = 1; l < 6; l++) {
    //   for (int s = 6; s > 0; s--) {
    //     if (l > s) {
    //       System.out.print("*");
    //     }
    //   }
    //   System.out.println("*");
    // }

    // Approach 1: Nested Loop
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println("");

    }
    // Approach 2: Single loop & String
    String str = "";
    for (int l = 0; l < 5; l++) {
      str += "*";
      System.out.println(str);
    }
    // Approach 3: Nested Loop & String
    str = "";
    for (int i = 0; i < 5; i++) {
      str = "";
      for (int j = 0; j < i + 1; j++) {
        str += "*";
      }
      System.out.println(str);

    }
  }
}