import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoHashTable {

  Map<String, Integer> table = new Hashtable<>();
  
  public static void main(String[] args) {

    DemoHashTable hashTable = new DemoHashTable();

    Runnable putOne = () -> {
      for(int i = 0; i < 10000; i++){
      hashTable.table.compute("abc" , (key,old) -> old == null ? 1 : old +1);
      }
    };

    Thread thread = new Thread(putOne);
    Thread thread2 = new Thread(putOne);

    thread.start();
    thread2.start();

    try {
      thread.join();
      thread2.join();
    } catch (InterruptedException e) {

    }

    System.out.println(hashTable.table.get("abc"));
    


    
  }
  
}
