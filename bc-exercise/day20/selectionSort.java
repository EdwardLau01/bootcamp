import java.util.Arrays;

public class selectionSort {
  // 5, 100, 200, 600, 999, 1

  // 1 st : 5 , 100 , 200, 600, 999, 1

  // 2nd : 5 , 100 , 200 , 600 , 999 , 1

  // 3rd : 5 , 100 , 200 , 600 , 999 , 1

  // 4th : 5 , 100 , 200 , 600 , 999 , 1

  // 5th : 5 , 100 , 200 , 600 , 1 , 999
  // 5 , 100 , 200 , 1, 600 , 999
  public static void main(String[] args) {
    int[] nums = new int[] { 2, 4, 1, 3 };
    System.out.println(Arrays.toString(Sort(nums)));

  }

  public static int[] Sort(int[] array) {
    int count = 0;
    for (int i = 0; i < array.length - 1; i++) {

      int minInx = i;
      int min = array[i];

      for (int j = 1 + i; j < array.length; j++) {
        count++;
        if (min > array[j]) {
          // 重設minInx, min
          minInx = j;
          min = array[j];
          System.out.println("[" + count + "]" + Arrays.toString(array));
        }
      }
      // 兩值必須交換
      if (minInx != i) {
        array[minInx] = array[i];
        array[i] = min;
        System.out.println("[" + count + "]" + Arrays.toString(array));
      }
      System.out.println("[" + count + "]");
    }
    return array;
  }
}
