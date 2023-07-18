public class primitives {
  public static void main(String[] args) {
    // correct Syntax
    // Upcasting (Implicit consersion)
    // byte -> short -> int -> long -> float -> double
    byte b = 2;
    short s = b;
    int i = s;
    long l = i;
    float f = l;
    double d = f;
    // char -> int
    char c = 'A';
    int j = c;

    // Downcasting
    double d2 = 10.3d;
    //float f2 = d2; //why error? double precision is larger the float
    float f2 = (float) d2; // developer take responsibilty for the risk

    short s2 = 128;
    // byte b2 = s2; // error
    byte b2 = (byte) s2; // Explicit conversion
    System.out.println("b2=" + b2); // -128

    float f4 = Long.MAX_VALUE;
    System.out.println("f4=" + f4);
    System.out.println("Long.max_value=" + Long.MAX_VALUE);

    long ga =  (long) f4;
    System.out.println("g=" + ga);

    // for(byte k =127; k < 129; k++) {
    //   System.out.println("hello");
    // }

    // int[] arr = new long[Integer.MAX_VALUE];
    // for (int n = 0; n < arr.length; n++) {

    // }

    char c2 = 'B';
    if (c2 == 66) {
      System.out.println("c2 is 66");
    }
    char c3 = 67;
    if (c3 == 'C') {
      System.out.println("c3 is C");
    }

    // ASCII (int )to char
    int g = 'a';
    int g2 = 33;
    char k = (char) g2; // downcasting , Explicit conversion
    char k2 = 66; // why? downcast 66 is ASCII code

    System.out.println(k + " " + k2);

    // 
    int h = (int)1000L; // downcasting , Explicit conversion
    short s10 = 128;
    byte o = (byte) s10;
    //byte o2 = 128; // error

    char character = 'a' + 1;
    if (character == 'b') {
      System.out.println("character=" + character);
    }
    if (character == 98) {
      System.out.println("character=" + character);
    }
    if (character > 'a') {
      System.out.println("character > a");
    }

    }


  }
