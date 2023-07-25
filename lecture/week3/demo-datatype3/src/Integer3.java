public class Integer3 {

  //Internal Cache ( -128 to 127)
  public static void main(String[] args) {
    Integer i1 = 100;
    Integer i2 = 100;
    System.out.println(i1 == i2); // true , address same not mean value

    Integer i3 = 128;
    Integer i4 = 128;
    System.out.println(i3 == i4); // faslse

    Integer i5 = -128;
    Integer i6 = -128;
    System.out.println(i5 == i6); // ture

    //Byte b1 = new Byte(127); // destory Internal Cache

    Short s1 = 100;
    Short s2 = 100;
    System.out.println(s1 == s2); // ture

    Long l1 = 120L;
    Long l2 = 120L;
    System.out.println(l1 == l2); // true

    // No Internal Cache in Float and Double
    Float f1 = 120f;
    Float f2 = 120f;
    System.out.println(f1 == f2); // false

    Double d1 = 1.2d;
    Double d2 = 1.2d;
    System.out.println(d1 == d2); // false

    Boolean bool1 = false;
    Boolean bool2 = false;
    System.out.println (bool1 == bool2); // true , same address

    // Internal Cache -> ASCII(0 -127)
    Character c1 = 'a';
    Character c2 = 'a';
    Character c3 = 'Ϩ'; // ASCII 1000
    Character c4 = 'Ϩ'; // ASCII 1000
    System.out.println(c1 == c2); // true , same address
    System.out.println(c3 == c4); // false

    Integer i7 = Integer.valueOf(127); // 127
    Integer i8 = 127;
    System.out.println(i7 == i8); // true 

    Integer i9 = Integer.valueOf(128); // 128
    Integer i10 = 128;
    System.out.println(i9 == i10); // false









  }
  
}
