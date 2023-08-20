import java.util.Vector;

public class TestVector {
  
  Vector<Integer> integers = new Vector<>();

  public static void main(String[] args) {
    TestVector testVector = new TestVector();

    Runnable add = () -> {
      for (int i = 0; i < 10000; i++) {
        testVector.integers.add(1);
      }
    };

    Thread thread = new Thread(add);
    Thread thread2 = new Thread(add);

    thread.start();
    thread2.start();

    try {
      thread.join();
      thread2.join();
    } catch (InterruptedException e) {

    }

    System.out.println(testVector.integers.size());

  }
}
