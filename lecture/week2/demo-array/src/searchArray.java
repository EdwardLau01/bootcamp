import java.util.Arrays;

public class searchArray {
  public static void main(String[] args) {
    // search
    char target = 'm';
    char[] chars = new char[] { 'j', 'p', 'm', 'q', 'c' };
    // loop to find the index of target in array chars
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == target) {
        System.out.println("chars[" + i + "}=" + chars[i]);
        break;
      }
    }

    // toCharArray()
    String str = "I am a boy.";
    char[] arr = str.toCharArray();
    System.out.println(Arrays.toString(arr));

    // Find Max. value in the array
    int[] nums = new int[] { 240, 800, -23, 6, 98 };
    int max = -2100000000;

    for (int i = 0; i < nums.length; i++) {
      //if (max <= nums[i]) {
        if (nums[i] > max) {
        max = nums[i];
      }
    }
    System.out.println("max = " + max);

        // Find Min. value in the array
    int [] nums2 = new int[] { 240, 800, -23, 6, 98 };
    int min = 2100000000;

    for (int i = 0; i < nums2.length; i++) {
      //if (min >= nums2[i]) {
        if (nums2[i] < min){
        min = nums2[i];
      }
    }
    System.out.println("min. = " + min);

  }

}
