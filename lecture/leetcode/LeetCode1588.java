package lecture.leetcode;

public class LeetCode1588 {
  // 1588. Sum of All Odd Length Subarrays
  // The odd-length subarrays of arr and their sums are:
  // [1] = 1
  // [4] = 4
  // [2] = 2
  // [5] = 5
  // [3] = 3
  // [1,4,2] = 7
  // [4,2,5] = 11
  // [2,5,3] = 10
  // [1,4,2,5,3] = 15
  // If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 4, 2, 5, 3 }; // 58
    int[] arr2 = new int[] { 10, 11, 12 }; // 66

    System.out.println(String.valueOf(sumOddLengthSubarrays(arr)));
  }

  public static int sumOddLengthSubarrays(int[] arr) {
    int sum = 0;
    int odd = 1;
    int count = 0;
    int idx = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - odd; j++) {
        while (count <= odd) {
          sum += arr[idx];
          count++;
        }
        count = 0;
      }
      odd += 2;
      if (odd > arr.length) {
        break;
      }
    }
    return sum;
  }
}
