import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomicInteger {
  AtomicInteger number = new AtomicInteger(0); // 

  public static void main(String[] args) {
    TestAtomicInteger i = new TestAtomicInteger();
    // i.number++; // non-Atomic Operation

    Runnable increment = () -> {
      for(int x = 0; x < 10000; x++){
        i.number.incrementAndGet(); //Atomic Operation   //i.number++
      }
    };

    Thread thread = new Thread(increment);
    Thread thread2 = new Thread(increment);

    thread.start();
    thread2.start();

    try{
      thread.join();
      thread2.join();
    } catch(InterruptedException e) {

    }
    System.out.println(i.number);
  }
  
}
