package person;

import java.util.List;

public interface Swimable {
  void swim();

  public static void start (List<? extends Swimable> humans) {
    for (Swimable human : humans) {
      human.swim();
    }
  }
  
}
