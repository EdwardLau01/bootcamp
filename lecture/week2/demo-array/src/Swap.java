public class Swap {
public static void main(String[] args) {
  int[] arr = new int[] { 100 , -400 , 3 , 99 , 90};
  // code here ...to swap 100 and 99
  int temp = arr[0];
  arr[0] = arr[arr.length -1];
  arr[arr.length - 1] = temp;

  //print all elements
  for (int i = 0; i < arr.length; i++) {
    System.out.println("arr[" + i + "]=" + arr[i]);
  }
  System.out.println(SwapOddEventCharacter("hello!"));
  System.out.println(SwapOddEventCharacter("ab cd"));
  System.out.println(SwapOddEventCharacter("abcdef"));
  //int a = =Math.abs("123");


}
  // Swap
  public static String SwapOddEventCharacter(String str) {
    // hello! -> ehll!o
    // abcd -> badc
    // aabb -> aabb
    // abcdef -> badcfe
    // abc -> bac
    // c -> c
    char[] chars = str.toCharArray();
    char temp;
    for ( int i = 0; i < chars.length - 1; i++) {
      if ( i % 2 == 0) {
        temp = chars[i];
        chars[i] = chars[i + 1];
        chars[i + 1] = temp;
      }
    }
    // String str1 = String.valueOf(123); // "123" int -> String
    // String str2 = String.valueOf(true); // "true" boolean -> String
    return String.valueOf(chars);

  }
}
