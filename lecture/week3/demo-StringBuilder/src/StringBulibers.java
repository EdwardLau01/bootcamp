public class StringBulibers {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder("Hello");
    // s -> address(reference)
    s.append(" World"); // append() is faster than "+" in String
    System.out.println(s); // Hello World
    System.out.println(s.toString()); // String -> "Hello"

    s.append(1.3f);
    System.out.println(s.toString());

    // Hello Word1.3true.4000
    System.out.println(s.append(true).append(4000L).length()); // 22

    String s2 = "  he llo ";
    String[] strs = s2.trim().replace('h' , 'e').split(" ");
    System.out.println(strs.length);

    StringBuilder s3 = new StringBuilder("start");
    System.out.println(s3.append('a').toString().charAt(3)); // r

    StringBuilder s4 = s3.append('a');
    String s5 = s4.toString();
    s5.charAt(3); // r

    // insert
    String s10 = "hello";
    StringBuilder s11 = new StringBuilder("hello");
    s11.insert(3 , ' ');
    System.out.println(s11);

    s11.insert(0, "world").append(" world"); // why do not we assign back to 
    System.out.println(s11);

    System.out.println(s11.deleteCharAt(3).toString());// wordel loworld

    System.out.println(s11.append("abc"));
    
    Integer a = 10;
    System.out.println(a + 10); // 20
    //a = 10

    s11.setCharAt(4 , 'J'); // void
    System.out.println(s11.toString()); // wordJel lo worldabc

    StringBuilder s1 = new StringBuilder("abc");
    String s100 = "bca";
    System.out.println(s1.append(s1.charAt(0)).deleteCharAt(0).equals(s100));

    System.out.println(s1);
    System.out.println(s1.toString().equals(s100));









    
  }
  
}
