/*
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 */

import java.util.ArrayList;
import java.util.List;

public class JavaQuest45 {
  public static void main(String[] args) {
    System.out.println(backspaceCompare("ab#c", "ad#c"));
    System.out.println(backspaceCompare("ab##", "c#d#"));
    System.out.println(backspaceCompare("a#c", "b"));

  }

  // Approach 1
  public static boolean backspaceCompare(String s, String t) {
    List<String> str = new ArrayList<>();
    List<String> str2 = new ArrayList<>();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != '#') {
        str.add(String.valueOf(s.charAt(i)));
        continue;
      }
      str.remove(str.size() - 1);
    }

    for (int i = 0; i < t.length(); i++) {
      if (t.charAt(i) != '#') {
        str2.add(String.valueOf(t.charAt(i)));
        continue;
      }
      str2.remove(str2.size() - 1);
    }

    String result = "";
    String result2 = "";

    for (String x : str) {
      result += x;
    }

    for (String x : str2) {
      result2 += x;
    }

    if (result.equals(result2))
      return true;

    return false;

  }

}
