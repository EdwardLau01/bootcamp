public class LogicalOpreators {
  public static void main(String[] args) {

    boolean isExpensive = true;
    boolean isWorthToBuy = false;
    // && Operator >> AND
    // true , ture >> true
    // true , false >> fasle
    // false , true >> fasle
    // false , false >> fasle
    boolean result = isExpensive && isWorthToBuy; // false

    // || Operator >> OR
    // true , true >> true
    // true , false >> true
    // false , true >> true
    // false , false >> false
    boolean result2 = isExpensive || isWorthToBuy; // true

    int a = 5;
    int b = 10;
    int c = 13;
    boolean result3 = a > 6 && b < 12; // fasle

    // Logical Operator
    boolean result4 = c < 15 || a > 6 && b < 12; // true
    boolean result5 = c < 15 || (a > 6 && b < 12); // true
    boolean result6 = a < 6 || b > 9 || c < 9; // true
    boolean result7 = (a < 6 || b > 9) & c < 9; // false
    boolean result8 = a < 6 || b > 9 & c < 9; // ture
    System.out.println(result8);

    // ==, >= , <= , !=
    // (! means not)
    // ==, means asking if a equals b ? -> true or false?
    boolean result9 = a == b; // false
    boolean result10 = a >= 5; // true
    boolean result11 = c <= 13; // true
    boolean result12 = c != 13; // fasle

    // asking if the event of (c < 13) is false
    boolean result13 = !(c < 13); // true

    boolean result14 = !(c == 13); // false
    System.out.println(result14);

    boolean result15 = !(b == 9) && c != 13; // true && false -> fasle

    // Operators Precedence
    int result16 = (1 + 9) * 3; // 30
    int result17 = ++result16 + 1; // result17 = 32

    int i = 27;
    int result18 = i++ + 1;
    System.out.println(result18); // result18 = 28
    System.out.println(i); // i = 28

    boolean result19 = 25 + 2 < result18 + 1; // true

    //
    int x = 5;
    int y = 10;
    int z = x += 3 * y;
    System.out.println(z); // STEP1. 3 * 10 -> STEP2. 5 + 30 >> 35

    System.out.println("1st x=" + x); // x = 35
    int result20 = (x++ + 2) * x++;
    System.out.println("result20=" + result20);
    System.out.println("2nd x=" + x); // x =37

    x = 5;
    int result21 = (x++ + 2) * x++;
    // (X++ + 2) -> 7, x become 6
    // 7 * 6 -> 42, x become 7
    System.out.println("result21=" + result21);
    System.out.println("x=" + x);
    
  }

}
