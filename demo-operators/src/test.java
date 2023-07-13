public class test {
  public static void main(String[] args) {

    byte a = 90;
    char level = 'Z';
    if (a >= 90) {
      level = 'A';
    } else if (a >= 80) {
      level = 'B';
    } else if (a >= 70) {
      level = 'c';
    } else {
      level = 'D';
    }
    System.out.println("level is " + level);

    
    for (int b = 5; b >= 0; b--){
      System.out.println(" b - 1 = "+ b);
    }

    for (int c = 2; c >= 1; c/= 2){
      System.out.println(" c = "+ c);
    }


  }
}
