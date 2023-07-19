import java.util.Arrays;

public class Swap2 {
  public static void main(String[] args) {
    int[] nums = new int[] { 8, 3, -10, 30, 100, -19 };
    // Move the max number to the tail
    // 8 , 3 , -10 , 30 , -19 , 100

    // int temp = 0;
    // int temp2 = 0;
    // int temp3 = 0;
    // for (int i = 0; i < nums.length; i++) {
    // if (temp < nums[i]) {
    // temp = nums[i];
    // temp2 = i;
    // }
    // if (i == nums.length - 1) {
    // temp3 = nums[i];
    // nums[i] = temp;
    // nums[temp2] = temp3;
    // }
    // }
    
    int maxIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if(nums[i] > nums[maxIndex]) {
        maxIndex = i;
      }
    }
    int temp = nums[maxIndex];
    nums[maxIndex] = nums[nums.length -1];
    nums[nums.length - 1] = temp;
    System.out.println(Arrays.toString(nums));

    //Test average
    int[] testCase = new int [] {2, 3, 0};
    System.out.println(average(testCase));

    int[] classA = new int[] {20, 30, 80};
    int[] classB = new int[] {90, 30, 100};

    if (average(classA) > average(classB)) {
      System.out.println("classA is avergae higher socer");
    }
  }

  public static double average(int[] arr) {
    // calulate the average of all numbers in arr.
    // double sum = 0;
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    // double result = sum / arr.length; // int / int = int

    return (double)sum / arr.length;
  }
}
