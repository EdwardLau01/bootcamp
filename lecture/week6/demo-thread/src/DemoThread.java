public class DemoThread {

  public static void main(String[] args) {
    // Approach 1 : RUNNABLE (lambda) to implentn to

    // Task Logic
  Runnable printout = () -> {
    for(int i = 0; i <1000; i++){ // step 4
      System.out.println("i= " + i);
    }
  };

    //Task 
    Thread thread = new Thread(printout); //Task Mangament

    System.out.println("start thread"); // step 1
    // thread.start();// step 2
    System.out.println("end thread");// step 3
  

  // Approach 2 : Create PrintOut Class implmement Runnable
  Thread thread2 = new Thread(new PrintOut());

  System.out.println("start thread 2");
  thread2.start();
  System.out.println("end thread 2");

  // Approach 3 : Create PrintOut2 Class implmement Runnable
  Thread thread3 = new Thread(new PrintOut2());
  thread3.start();

  try{
    thread.join();
    thread2.join();
    thread3.join();
  } catch(InterruptedException e) {

  }
  System.out.println("Main Thread Ends");
  }
}
