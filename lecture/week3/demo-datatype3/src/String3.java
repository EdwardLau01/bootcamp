public class String3 {

  //String Literal Pool(Heap) + String is immutable
  public static void main(String[] args){
    String str = "abc";
    String str2 = "abc";
    System.out.println(str.equals(str2)); // true, "abc" is same as "abc"
    System.out.println(str == str2); // true, adress same????

    //String Literal Pool -> "abc"
    String str3 = "abcd";
    System.out.println(str.equals(str3)); // false
    System.out.println(str == str3); // false, their address are not same

    str = "abc100"; // becuse"abc100" is not equals to "abc" -> immutale
    System.out.println(str == str2); // false
    String temp = str;
    str = new String("abc100");
    System.out.println(temp == str); // same values , but false,
    System.out.println(temp.equals(str)); // true


    String a1 = "abc100";
    String a2 = "abc100";
    System.out.println(a1 == a2);
    System.out.println(a1 == temp);
    System.out.println(a1 == str);

    a1 = str;
    System.out.println(a1 == str);




    




  }
  
}
