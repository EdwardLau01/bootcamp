import java.util.Scanner; // import

public class ReadInPuts {
  public static void main(String [] args) {

    String str = "Hello";
    str.charAt(0); // 'H'

    // Scanner -> read user input
    System.out.println("Please inpunt an integer:");
    Scanner s = new Scanner(System.in); // "new" means create 
    int input = s.nextInt (); // read user input, expecting it is an integer
    System.out.println("input=" + input);

    for (int i = 0; i < input; i++) {
      System.out.println("i = " + i + "Hello!"); // if input 3, means 0, 1, 2
    }

  }
  
}
