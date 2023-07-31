/*
 * Question : given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 */

// hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static void main(String[] args) {
    System.out.println(sameNumberOfVowels("book")); // true
    System.out.println(sameNumberOfVowels("textbook")); // false
  }

  public static boolean sameNumberOfVowels(String s) {
    // code here
    String s2 = s.toLowerCase();
    int count1 = 0, count2 = 0;
    int half = s.length() / 2;
    boolean sameNumberOfVowels = false;

    for (int i = 0; i < s.length(); i++) {
      if (i < half) {
        if (s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o'
            || s2.charAt(i) == 'u') {
          count1++;
        }
      }
      if (i >= half) {
        if (s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o'
            || s2.charAt(i) == 'u') {
          count2++;
        }
      }
    }
    if (count1 == count2) {
      sameNumberOfVowels = true;
    }
    return sameNumberOfVowels;

  }
}