import java.util.Arrays;

public class ForEach {
  public static void main(String[] args) {
    // basic for loop
    for (int i = 0; i < 3; i++) {
      System.out.println("basic hello");
    }
    // For-each
    int[] arr = new int[] { 200, 100, 3, 4 };
    // for (Type Elements : dataset)
    // Difference of for-each :
    // 1. for-each do not have stop condition/ counter inloop signature
    for (int x : arr) { // loop through all elements
      System.out.println("for-each: hello , x = " + x);
      System.out.println(arr[0]); // nut you still access element by index
      // modify
      arr[0] = 8;
    }
    // {1 , 4 , 10 , 13 , 20 , 0}
    // 1, 0
    // 4, 20
    // 10, 13
    for (int i = 0; i < arr.length; i++) { // counter
      if (i > arr.length / 2 - 1) {
        break;
      }
      System.out.println("for-each: hello");
      System.out.println("" + arr[i] + arr[arr.length - i - 1]);
    }

    //
    String[] strs = new String[] { "hello", "world" };

    for (String x : strs) {
      System.out.println(x);
    }
    // Integer, Character (Wrapper Class)
    Character[] chars = new Character[] { 'L', 'a', '!', '(' };
    for (Character c : chars) {
      System.out.println(c);
    }

    String s2 = "Hello World ! I am Edward";
    // String[] strings = s2.split(" ");
    // for (String s : strings) {
    //   System.out.println(s);
    // }
    // with using split, ues a for loop to split s2
    char[] s2a = s2.toCharArray();
    String[] s2b = new String [s2a.length];
    int p = 0;
    for (int i = 0; i < s2a.length; i++) {
      if (i == 0) {
        s2b[p] = "";
      }
      if (s2a[i] == ' ') {
        p++;
        s2b[p] = "";
      } else {
        s2b[p] += s2a[i];
      }
    }
    for (int j = 0; j < s2b.length; j++){
      if(s2b[j].isBlank()){
        break;
      }
      System.out.println(s2b[j]);
    }

    //Approach 1: substring
    // count Spaces
    
    System.out.println(Arrays.toString(split(s2)));
  }

  public static String[] split(String s){

    int spaceCount = 0;
    String str = s.trim();
    for(int i = 0; i < str.length(); i++) {
      if (s.charAt(i) == ' '){
        spaceCount++;
      }
    }
    String [] result = new String[spaceCount + 1];
    int startIndex = 0;
    int idx = 0;
    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == ' ') {
        result[idx] = str.substring(startIndex , i);
        idx++;
        startIndex = i + 1;
      } else if (i == str.length() - 1) { // last character
        result[idx] = str.substring(startIndex , str.length());
      }
    }
    return result;

  }
}
