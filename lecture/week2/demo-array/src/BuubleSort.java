import java.util.Arrays;

public class BuubleSort {
  public static void main(String[] args) {
    // [5, 1, 4, 8, 2]
    // step1.1 [1, 5, 4, 8, 2]
    // step1.2 [1, 4, 5, 8, 2]
    // step1.3 [1, 4, 5, 8, 2] (no change, due to 5 < 8)
    // step1.4 [1, 4, 5, 2, 8]
    // step2.1 [1, 4, 5, 2, 8] (no swap , due to 1 < 4)
    // step2.2 [1, 4, 5, 2, 8] (no swap , due to 4 < 5)
    // step2.3 [1, 4, 2, 5, 8]
    // ...
    // target: [1, 4, 5, 2, 8]

    int[] nums = new int[] { 5, 1, 4, 8, 2 };
    System.out.println(Arrays.toString(sort(nums)));
    // System.out.println(Arrays.toString(nums));
  }

  public static int[] sort(int[] arr) {
    int temp = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }

}
