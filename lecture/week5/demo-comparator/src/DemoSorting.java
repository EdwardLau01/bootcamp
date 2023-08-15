import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DemoSorting {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[] { 4, -10, 9, -20, 100 };
        Arrays.sort(arr); // n* logn
        System.out.println(Arrays.toString(arr)); // [-20, -10, 4, 9, 100]

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(-100);
        arrayList.add(-88);
        arrayList.add(4);
        Collections.sort(arrayList); // nlogn. ascending sorting
        System.out.println(arrayList);

        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(4, Color.BLUE));
        balls.add(new Ball(1, Color.RED));
        balls.add(new Ball(2, Color.YELLOW));
        balls.add(new Ball(3, Color.YELLOW));
        Collections.sort(balls);
        System.out.println(balls); // [[id=4], [id=3], [id=2], [id=1]]
    }
}
