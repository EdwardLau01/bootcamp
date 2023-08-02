public class Strings implements CharSequence {

  char[] arr;

  public Strings(String str) {
    arr = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      arr[i] = str.charAt(i);
    }
  }

  public static Strings valueOf(String str) {
    return new Strings(str);
  }

  @Override
  public int length() {
    return arr.length;
  }

  @Override
  public char charAt(int idx) {
    return this.arr[idx];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    if (start < 0 || end < 0 || end < start || start > this.arr.length - 1
        || end > this.arr.length) {
      return String.valueOf(this.arr);
    }
    // return String, StringBuilder, StringBuffer
    StringBuilder sb = new StringBuilder();
    for (int i = start; i < end; i++) { // end - 1
      sb.append(this.arr[i]);
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    // CharSequence -> Interface
    String str = "abc";
    // Strings s = new Strings("abc");
    Strings s = Strings.valueOf("abc");
    System.out.println(s.subSequence(1, 3)); // bc
  }

}
