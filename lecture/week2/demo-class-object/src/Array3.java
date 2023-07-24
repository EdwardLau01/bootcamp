import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Array3 {
  public static void addOne(int[] arr){ // pass by reference
    for (int i = 0; i < arr.length; i++){
      arr[i] = arr[i] + 1;
    }
  }

  // All Wrapper Class + String -> Pass by Value
  public static String concat(String s1, String s2) {
    s1 = "Hello";

    return s1 + s2;
  }

  public static void main(String[] args) {
    int[] nums = new int[] {3, 4, 8};
    addOne(nums); // [4, 5, 9]

    for(int y : nums){
      System.out.println(y);
    }

    //Call concat
    String a = "abc";
    String b = "def";
    String result = concat(a, b); // hellodef
    System.out.println(result);
    //a = abc
    System.out.println(a);

  }
  
}
