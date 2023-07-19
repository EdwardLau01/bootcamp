import java.util.Random;

public class Random1 {
  public static void main (String[] args) {
    int num = new Random().nextInt(3); // 0, 1, 2
    System.out.println(num);

    int num2 = new Random().nextInt(3) + 1; // 0, 1, 2
    System.out.println(num2);

    System.out.println(randomAbcde());
  }
  //A, B, C, D, E
  public static char randomAbcde() {
    return (char)(new Random().nextInt(5) + 65);
  }
}
