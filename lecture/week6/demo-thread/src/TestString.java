public class TestString {

  String str = "";
  public static void main(String[] args) {
    TestString testString = new TestString();
 
    Runnable addString = () -> {
      for(int i = 0; i < 10000; i++){
       testString.str += "s";
      }
    };

    Thread thread = new Thread(addString);
    Thread thread2 = new Thread(addString);

    thread.start();
    thread2.start();

    try{
      thread.join();
      thread2.join();
    } catch(InterruptedException e){

    }

    System.out.println(testString.str.length());
    
  }
  
}
