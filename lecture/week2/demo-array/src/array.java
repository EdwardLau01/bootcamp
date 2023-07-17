import java.util.Arrays;

public class array {
  public static void main (String[] args) {
    int num = 7;
    int num2 = 8;
    int num3 = -30;

    //Create Array /can be use 'arr' / 'nums'
    int[] nums = new int[3]; // 3 is the length of array nums
    // with index 0, 1, 2
    nums[0] = -40;
    nums[1] = 500;
    nums[2] = -1000;
    nums[0] = 500000;
    //nums[3] = 5; // ArrayIdexOutOfBoundsException: Index 3 out of bounds for length 3
    //nums[-1] = 7; 

    double[] arr = new double [4];
    arr[0] = 4;
    arr[1] = 7;
    arr[2] = 10;
    arr[3] = 2000;
    // arr[0] = "123" // Type Issue

    System.out.println(arr[3]);

    //char[] , int[] , String[]

    // for loop
    for(int i = 0; i < nums.length; i++){ //nums.length -> 3
      System.out.println("nums[" + i + "] = " + nums[i]);
    }
    //reversely print array nums

    for(int i = nums.length - 1; i >= 0; i --) {
      System.out.println("nums[" + i + "]=" + nums[i]);
    }
    // Approach 2, create Array
    int [] array = new int[] {3, 9, 12};
    
    for ( int i = 0; i < array.length; i++) {
      System.out.println("array[" + i + "]=" + array[i]);
    }

    // Can add a new element at tail? NO
    // MODIFY AN ELEMENT
   array[2] = -10;
   // Access an element
   int index = 2;
   System.out.println(array[index]);  // -10

   //char[]
   char[] chars = new char[3];
   chars[2] = 'a';
   chars[0] = '!';
   for (int i = 0; i < chars.length; i++) {
    System.out.println("chars[" + i + "]=" + chars[i]);
   }

   long[] numbers = new long[4];
   numbers[0] = 123;
   for (int i = 0; i < numbers.length; i++) {
    System.out.println("numbers[" + i + "]=" + numbers[i]);
   }
   boolean[] arr2 = new boolean[2];
   arr2[0] = true;
   for (int i = 0; i < arr2.length; i++) {
    System.out.println("arr2[" + i + "]=" + arr2[i]);
   }

   //String
   String[] strs = new String[] { "hello" , "abc" , "goodbye"};
   strs[1] = "typhoon";
   for (int i = 0; i < strs.length; i++) {
    System.out.println("strs[" + i + "]=" + strs[i]);
   }

   String[] fruits = new String[5];
   fruits[0] = "apple";
   fruits[1] = "watermelon";
   fruits[2] = "orange";
   System.out.println(Arrays.toString(fruits));
   byte[] bytes = new byte[6];
   bytes[3] = 10;
   System.out.println(Arrays.toString(bytes));







  }
  
}
