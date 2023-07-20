public class InsertionSort {
  public static void main(String[] args) {
    // {5 , 1 , 4 , 8 , 2}
    // Step1.1 : [1, 5, 4, 8, 2] (insert 1 to arr[0], 1 < 5)
    // After round 1, [1, 5] is sorted
    // step2.1 : compare 4 < 5
    // step2.2 : compare 1 < 4 -> [1, 4, 5]
    // After round 2, [1, 4, 5] is sorted
    // 5, 1, 4, 8, 2
    // 1, 5, 4, 8, 2
    // 1, 4, 5, 8, 2
    // 1, 2, 4, 5, 8

    int[] str = new int[] { 5, 1, 4, 8, 2 };
    int idx = 0;
    int temp = 0;
    for (int i = 0; i < str.length - 1; i++) {
      int j = 0;
      while(j <= i) {
        if (str[i + 1] < str[j]) {
          idx = 0;
          
        }
        j++;
      }
        

          

        }
        

      
      }
    }
