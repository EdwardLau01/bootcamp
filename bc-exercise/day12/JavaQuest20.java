/*
 * Question : Given two strings s and goal, 
 * return true if and only if s can become goal after N shifts on s.

Definition of a shift:
Moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

Assume the input need to be lowercase English letters.
*/
public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }

  public static boolean rotateString(String s, String goal) {
    boolean rotateString = false;
    StringBuilder s2 = new StringBuilder(s);
    int stop = s.length();
    int start = 0;
    while (start < stop) {
      s2.append(s2.charAt(0)).deleteCharAt(0);
      if (s2.toString().equals(goal)) {
        rotateString = true;
        break;
      }
      start++;
    }
    return rotateString;

  }
}