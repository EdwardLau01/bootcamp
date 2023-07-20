import java.util.Scanner;
public class doWhileLoop {
  public static void main (String[] args) {
    // do-while, do frist, then check condition to start looping
    int count = 0;
    do {
      System.out.println("hello");
      count++;
    } while(count < 3);

    int input = 0;
    Scanner scanner;
    do {
      scanner = new Scanner(System.in);
      System.out.println("please input a integer");
      input = scanner.nextInt();
      // if input is even -> continue
      // if input is odd -> exit loop / print the number
      if (input % 2 == 0) {
        continue;
      }
    } while (input % 2 == 0);

    //if (input % 2 == 1) {
      System.out.println ("input = " + input);
      scanner.close();

      
    }
    }
