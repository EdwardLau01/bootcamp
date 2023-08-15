package map;

import java.util.HashMap;
import java.util.Map;

public class AnimalMap<T> {
  Map<T, String> map;

  public AnimalMap() {
    map = new HashMap<>();
  }

  public void put(T key, String animal) {
    map.put(key, animal);
  }

  // public void get(T key, String animal) {
  //   map.get(key, animal);
  // }

  public static void main(String[] args) {

    AnimalMap<String> map1 = new AnimalMap<>();
    // map.put(key, value);
    map1.put("abc", "Dog");

    AnimalMap<Integer> map2 = new AnimalMap<>();
    map2.put(1, "Dog");
  }
}
