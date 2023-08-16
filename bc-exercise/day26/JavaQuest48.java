/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false */

import java.util.Stack;

public class JavaQuest48 {
  public static void main(String[] args) {
    System.out.println(isValid("()")); // true
    System.out.println(isValid("()[]{}"));// true
    System.out.println(isValid("(]"));// false
    System.out.println(isValid("([{}]){[]}"));// true

  }

  public static boolean isValid(String s) {
    Stack<Character> temp = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      temp.push(s.charAt(i));
    }
    int round = 0;
    int square = 0;
    int curly = 0;
    char bracket = ' ';

    for (int j = 0; j < s.length(); j++) {
      bracket = temp.pop();
      if (bracket == ')')
        round++;
      if (bracket == ']')
        square++;
      if (bracket == '}')
        curly++;
      if (round >= 1 && bracket == '(')
        round++;
      if (square >= 1 && bracket == '[')
        square++;
      if (curly >= 1 && bracket == '{')
        curly++;
    }

    if (round % 2 == 0 && curly % 2 == 0 && square % 2 == 0)
      return true;

    return false;
  }

}
