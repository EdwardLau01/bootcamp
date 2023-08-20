import java.util.Arrays;

public class demoTest {
  public static void main(String[] args) {

    byte b = 7;
    byte b2 = 30;
    System.out.println((byte) (b * b2));

    StringBuilder sb = new StringBuilder();

    StringBuilder sb2 = new StringBuilder();
    sb.append("abc ");
    sb.appendCodePoint(67);
    sb2.append(" d ef ");
    System.out.println(sb);
    System.out.println(sb.compareTo(sb2));

    // System.out.println(sb2.trim());

    System.out.println(sb2.indexOf("e"));

    String s = " abc bgs";
    System.out.println(Arrays.toString(s.trim().split(" ")));
    s.trim();

    System.out.println(Math.sqrt(4));
    System.out.println(Math.PI);

    double d = 0.2 + 0.11;
    System.out.println(d);
  }

}
