public class String2 {
  public static void main(String[] args) {
    // method signture = method name + parameter type & quantity

    String str = "hello  ";
    String str2 = "   hel   lo  ";
    System.out.println("str.trim()=" + str.trim()); // "hello"
    System.out.println("str2.trim()=" + str2.trim()); // "hel lo

    // startsWith(), check if the string start with the taget string
    if (str.startsWith("hel")) {
      System.out.println("The string starts with hel");
    }
    boolean endsWithSpace = str.endsWith(" ");
    if (endsWithSpace) {
      System.out.println("The string ends with space");
    }
    //************* 
    //indexOf(char) or indexOf(int) -> if have two same character only the frist
    System.out.println("The index of o in str = " + str.indexOf('o')); // 4
    // indexOf(string)
    System.out.println("The index of ll in str = " + str.indexOf("ll")); // 2
    System.out.println("The index of lll in str = " + str.indexOf("lll")); // -1 , if cannot find will print -1
    // indexOf(char , from index)
    System.out.println(
      "The index of o in str, seach from index 5= " + str.indexOf('o' , 5)); // -1
      System.out.println(
      "The index of ll in str, seach from index 5= " + str.indexOf("ll" , 3)); // -1
      
      String str3 = "hello";
      System.out.println(
      "The index of o in str, seach from index 5= " + str3.lastIndexOf('o')); // 4
      System.out.println(str3.lastIndexOf("ll")); // 2
      System.out.println(str3.lastIndexOf('l' , 5)); // 3

      //****************************
      //Replace
      String s = "Java is a programming language";
      System.out.println(s.replace("Java" , "Python")); // Python is programming language
      System.out.println(s.replace('p' , 'q'));
      
      // equals , equalsIgnoreCase
      if ("hello".equals(str3)) {
        System.out.println("str3 = hello");
      }
      if ("Hello".equals(str3)) {
        System.out.println("str3 = Hello");
      }
      if ("Hello".equalsIgnoreCase(str3)) { // true , non case sensitive
        System.out.println("non case sensitive checking");
      }
      if ("HELLO".equals(str.toUpperCase())) {
        System.out.println("Alternative");
      }

      //concat(String) , append something
      String newString = str3.concat(" Java!"); // + operaton
      System.out.println("newString = " + newString); // hello Java!
      str3 = str3.concat(" Java!");
      System.out.println("str3 = " + str3); // hello Java!

      // compareTo
      String apple = "Apple";
      String facebook = "facebook";
      System.out.println(apple.compareTo(facebook)); // -37 , 65 - 102 ('A' - 'f') ASCII CODE
    }
  }
