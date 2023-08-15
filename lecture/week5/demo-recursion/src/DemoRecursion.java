import java.util.ArrayDeque;
import java.util.Deque;

public class DemoRecursion {
    public static void main(String[] args) throws Exception {
        // algorithm -> algo
        System.out.println(sum(5)); // 15
        System.out.println(sum2(6)); // 8
        print(3);
    }

    // Question 1:
    // k + (k - 1) + (k - 2) + .......+ 0
    public static int sum(int k) {
        if (k < 1) // base condition
            return k;
        return k + sum(k - 1);
        // 15 , return
        // 5 + 10, return
        // 4 + 6, return
        // 3 + 3, return
        // 2 + 1, return
        // 1 + 0, return
        // 0 < 1 , return 0;
    }

    // Question 2
    // 0, 1, 1, 2, 3, 5, 8, 13, .....kth element [0, 1, 2, 3, ...]
    // k = 6, return 8
    public static int sum2(int k) {
        if (k <= 1)
            return k;
        return sum2(k - 2) + sum2(k - 1);
    }

    // Question 3
    // 3 2 1 1 2 3, k = 3;
    public static void print(int k) {
        // Deque<Integer> arr = new ArrayDeque<>();
        // for (int i = 1; i <= k; i++) {
        // arr.addLast(i);
        // arr.addFirst(i);
        // }
        // System.out.println(arr);

        if (k < 1)
            return;
        System.out.print(k + " ");
        print(k - 1);
        System.out.print(k + " ");
    }
}
