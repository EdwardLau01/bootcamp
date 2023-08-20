public class TestSynchronized {

  int number;

  public synchronized void increment(){ // Like a "Atomic" method
    this.number++;
  }
  public static void main(String[] args) {
    
    TestSynchronized testSynchronized = new TestSynchronized();

    Runnable add = () -> {
      for (int i = 0; i < 10000; i++) {
        testSynchronized.increment();
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

    System.out.println(testSynchronized.number);

  }
}
