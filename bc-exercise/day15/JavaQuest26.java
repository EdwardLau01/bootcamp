/*
 * 
 * Question : You are given an integer array nums. 
 * The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/

public class JavaQuest26 {
  public static void main(String[] args) {
    System.out.println(sum(new int[] { 1, 2, 3, 2 })); // 4
    System.out.println(sum(new int[] { 1, 1, 1, 1, 1 }));// 0
    System.out.println(sum(new int[] { 1, 2, 3, 4, 5, 6 }));// 21
    System.out.println(sum(new int[] { 1 }));// 1
  }

  public static int sum(int[] nums) {
    // code here
    int sum = 0;
    int[] result = new int[100];
    for(int x : nums){
      result[x]++;
    }
    for (int i = 0; i < result.length; i++) {
      if (result[i] == 1) {
        sum += i;
      }
    }
    return sum;

  }

}