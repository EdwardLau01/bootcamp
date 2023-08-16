/*
 * Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
 * 
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 * 
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaQuest46 {
  public static void main(String[] args) {
    System.out.println(findGCD(new int[] { 2, 5, 6, 9, 10 }));
    System.out.println(findGCD(new int[] { 7, 5, 6, 8, 3 }));
    System.out.println(findGCD(new int[] { 3, 3 }));

  }

  public static int findGCD(int[] nums) {
    Arrays.sort(nums);
    int length = nums.length;
    int result = 0;
    Set<Integer> ints = new HashSet<>();
    for (int i = 1; i <= nums[length - 1]; i++) {
      if (nums[length - 1] % i == 0)
        ints.add(i);
    }

    for (int j = 1; j <= nums[length - 2]; j++) {
      if (nums[length - 2] % j == 0 && !ints.add(j))
        result = j;
    }
    return result;
  }

}
