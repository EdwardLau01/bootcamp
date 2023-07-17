public class String1 {
  public static void main(String[] args) {
    // length() , equals() , charAt()

    // isEmpty()
    String str = "hello";
    System.out.println(str.isEmpty()); // false
    String str2 = "";
    System.out.println(str2.isEmpty()); // true
    String str3 = " ";
    System.out.println(str3.isEmpty()); // false

    // isBlank()
    System.out.println(str.isBlank()); // false
    System.out.println(str2.isBlank()); // true
    System.out.println(str3.isBlank()); // true

    str = "Hello";
    // toLowerCase(), toUpperCase()
    System.out.println(str.toUpperCase()); // HELLO
    System.out.println(str); // Hello
    System.out.println(str.toLowerCase());// hello
    System.out.println(str.toUpperCase().toLowerCase()); // hello
    if (str.toUpperCase().equals("HELLO"))
      ;
    {
      System.out.println("yes, it is HELLO");
    }

    // substring( , ) //(a , b) a = start index / b = end index -1
    // startIndex , is normal index
    // endIndex , represents the position of (last character + 1)
    // Hello -> He
    System.out.println(str.substring(0, 2)); // He
    System.out.println(str.substring(2, 3)); // l
    System.out.println(str.substring(0, 5)); // Hello //(str.substring(0, str.length()));

    // substring() // (a) a = start index , defalt endIndex
    System.out.println(str.substring(3)); // lo

    if (str.substring(3).equals("lo")) {
      System.out.println("str contains lo");
    }

    // contains()
    String s = "lo";
    System.out.println(str.contains(s)); // true (hello contains "lo")
    System.out.println(str.contains("ol")); // false (hello not contains "ol")

    if (str.contains("lo")) {
      System.out.println("str contains lo");
    }

    str = str.toUpperCase(); // it will change the str to UpperCase // HELLO
    System.out.println(str); // HELLO
    
    str += str.toLowerCase(); 
    System.out.println(str); // HELLOhello

  }

}
