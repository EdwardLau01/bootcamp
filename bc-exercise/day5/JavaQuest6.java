/**
 * Expected output:
 * 1 1 2 3 5 8 13 21 ...
 * 
 */
// Count the target of character in a String.
public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence

    int a = 1;
    int b = 1;
    int sum = 0;

    for (int i = 0; i < 15; i++) {
      sum = a + b;
      System.out.print(a + " ");
      a = b;
      b = sum;
    }
    // a = 1 , b = 1 , c = 2
    // a = 1 , b = 2 , c = 3
    // a = 2 , b = 3 , c = 5
    // a = 3 , b = 5 , c = 8
    // a = 5 , b = 8 , c = 13

  }
}