import java.util.Scanner;
import java.util.Random;

public class Game {
  public static void main ( String[] args) {

    int bomb = new Random().nextInt(100) + 1; // 1 - 100
    Scanner scanner;
    int min = 1;
    int max = 100;
    int input = 0 ;
    
    do {
      scanner = new Scanner(System.in);
      System.out.println (bomb);
      System.out.println ("Please input (" + min + " - " + max + ")");
      input = scanner.nextInt();
      if (input < min || input > max) {
        continue;
      }
      if (input < bomb) {
        min = input + 1;
      } else if (input > bomb) {
        max = input - 1;
      }

    } while (input != bomb);
    System.out.println("BOMB!");


  }
  
}
