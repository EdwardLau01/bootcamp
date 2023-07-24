public class Strings1 {
  public static void main(String[] args) {
    String str = "I am sad , but happy";
    str = str + ".";
    System.out.println(str);
    System.out.println("I AM");

    // Method
    // length()
    int i = str.length(); // lenght(), tool to return the lenght of str
    System.out.println(i);
    System.out.println("i=" + i); //convert i to String "21 -> "i=21"

    System.out.println("hello".length()); // 5

    // equals()
    String str1 = "abc";
    String str2 = "abcd";
    String str3 = "abc";
    boolean areTheyEqual = str1.equals(str2); // false
    boolean areTheyEqual2 = str1.equals(str3); // true
    boolean b4 = str2.equals(str1 + "d"); // true
    System.out.println(b4); // true

    // charAt(2), find the char at index 2 of the String
    String str4 = "helloworld";
    //index 0 of str4 -> 'h'
    //index 4 of str4 -> 'o'
    System.out.println(str4.charAt(2));
    System.out.println(str4.charAt(5));
    // System.out.println(str4.charAt(20)); //Error
    //System.out.println(str4.charAt(-2)); //Error

    



  }
}
