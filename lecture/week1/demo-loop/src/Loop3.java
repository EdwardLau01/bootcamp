public class Loop3 {
  public static void main(String[] args) {
    String str = "hello";

    // out put olleh

    String reversed = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reversed += str.charAt(i);
    }
    System.out.println(reversed);

    for (int i = str.length() - 1; i >= 0; i--) {
      System.out.print(str.charAt(i));
    }
    System.out.println("");
  }
}
