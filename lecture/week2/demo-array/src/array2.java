public class array2 {
  public static void main(String[] args) {
    String str2 = "ABCDEFG";
    System.out.println(swap("1 2", 0 , 1)); // ABCDGFE

  }

  public static String swap(String str, int idx1, int idx2) {

    if (str == null) {
      return null;
    }
    if (str.isBlank()) {
      return str;
    }
    if (idx1 < 0 || idx1 >= str.length()) {
      return str;
    }
    if (idx2 < 0 || idx2 >= str.length()) {
      return str;
    }
    char[] chars = str.toCharArray();
    char temp = chars[idx1];
    chars[idx1] = chars[idx2];
    chars[idx2] = temp;
    return String.valueOf(chars);
  }
}
