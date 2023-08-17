package arrayList1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList2 {

  public static void main(String[] args) {
    // ArrayList String
    ArrayList<String> strs = new ArrayList<>();
    strs.add("abc");
    strs.add("def");
    strs.add("xyz");
    strs.add("def");
    strs.

    System.out.println(strs.subList(1, 2)); // subString() like, def, from idx 1 to idx 1
    strs.remove("def"); // remove by Object
    System.out.println(strs); // [abc, xyz, def

    strs.remove(1); // remove by idex
    System.out.println(strs); // [abc, def]

    // while(strs.iterator().hasNext()) {
    // } // same to below
    Iterator<String> iterators = strs.iterator();
    while (iterators.hasNext()) {
      System.out.println(iterators.next());
    }

    for (String s : strs) { // for each support Array and ArrayList
      System.out.println(s);
    }

    Object[] objects = strs.toArray(); // ArrayList<String> -> Object[]
    for (Object o : objects) {
      if (o instanceof String) {
        String str = (String) o;
        System.out.println(str);
      }
    }

    // Array -> ArrayList
    String[] strings = new String[] {"hello", "world", "!"};
   
    List<String> s2 = new ArrayList<>();
    s2.add("abc"); // add() method must be reflecting the add() in ArrayList


    // Move m = new Student();

    // Parent parent = new Child(); // extends
    
    // Read only -> big bug /********************************* */
    // List<String> = Arrays.asList(strings);
    // strings.add("ijk"); // run-time error

    // Read & Write (Solution)
    List<String> stringList2 = new ArrayList<>(Arrays.asList(strings));
    stringList2.add("ijk");
    System.out.println(stringList2);

  }

}
