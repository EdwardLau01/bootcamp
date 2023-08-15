package hashmap1;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // Background : String[int],
    // Limitation : you can only access the element by int index
    // Solution : HashMap<>
    HashMap<String, String> map = new HashMap<>();
    // <String, String> -> <key, value>
    map.put("abc", "hello world");
    map.put("bcb", "I am Developer");
    System.out.println(map.size()); // 2 entries
    // Map.Entry -> Key + value

    // if duplicated(), override the entry
    map.put("abc", "hello world!!!");
    System.out.println(map.get("abc")); // hello world!!!
    System.out.println(map.isEmpty()); // false
    System.out.println(map); // {bcb=I am Developer, abc=hello world!!!}

    System.out.println(map.containsKey("abc")); // true
    System.out.println(map.containsValue("I am Developer")); // ture

    if (!map.containsKey(("abc")))
      return;

      // Loop Entires
      for(Map.Entry<String, String> entrys : map.entrySet()) {
        System.out.println(entrys.getKey() + ":" + entrys.getValue());
      } // bcb:I am Developer , abc:hello world!!!

      // Loop Keys
      for (String key : map.keySet()) {
        System.out.println(key);
      } // bcb , abc

      // Loop Values
      for (String value : map.values()) {
        System.out.println(value);
      } // I am Developer , hello world!!!

    System.out.println(map.remove("abc")); // hello world!!!
    System.out.println(map); // {bcb=I am Developer}
    System.out.println(map.remove("bcb", "I am Not Developer")); // false
    System.out.println(map.remove("bcb", "I am Developer")); // true
    System.out.println(map.size()); // 0 entries

  }

}
