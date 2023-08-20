import java.util.LinkedList;
import java.util.List;

public class TestArrayList {
  
  List<Integer> integers = new LinkedList<>();

  public static void main(String[] args) {
    TestArrayList testArray = new TestArrayList();

    Runnable addInteger = () -> {
      for (int i = 0; i < 10000; i++) {
        testArray.integers.add(1);
      }
    };

    Thread thread = new Thread(addInteger);
    Thread thread2 = new Thread(addInteger);

    thread.start();
    thread2.start();

    try {
      thread.join();
      thread2.join();
    } catch (InterruptedException e) {

    }

    System.out.println(testArray.integers.size());

  }
}