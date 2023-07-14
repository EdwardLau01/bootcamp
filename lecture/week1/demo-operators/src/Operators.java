public class Operators {
  public static void main(String[] args) {
    int a = 1;
    a = a + 1; // 2
    a = a - 2; // 0
    int b = 10 / 5; // 2
    b = b * 3 + 5; // 11
    System.out.println("a append b = " + a + b);

    int x = 1;
    x = x + 1;
    x++; // means x = x +1;
    ++x; // means x = x + 1;
    x += 1; // means x = x+1;
    System.out.println("x=" + x); // x=5

    int y = 10;
    y = y - 1;
    y--;
    --y;
    y -= 1;
    System.out.println("y=" + y); // y=6

    int g = 110;
    g++;
    ++g;
    System.out.println("g=" + g);

    // Other + , - , * , /
    int z = 4;
    z = z + 2;
    z += 2;
    System.out.println("z=" + z);

    int i = 6;
    i = i - 3;
    i -= 3;
    System.out.println("i=" + i);

    int w = 9;
    w = w * 3;
    w *= 3;
    System.out.println("w=" + w);

    int u = 81;
    u = u / 9;
    u /= 3;
    System.out.println("u=" + u);

    int integer = 12 % 5; // 2
    int integer2 = 12;
    integer2 %= 5; // 2

    // == , --
    int m = 3;
    m++; // 4
    int preIncrement = ++m; // m+1 frist, assignement later
    System.out.println("preIncrement=" + preIncrement); // 5

    int postIncrement = m++; // assignement frist, m+1 later
    System.out.println("postIncrement=" + postIncrement); // 5

    System.out.println("m=" + m); // 6

    int n = 4;
    n--;
    int preDecrease = --n;
    System.out.println("preDecrease=" + preDecrease);

    int postDecrease = n--;
    System.out.println("postDecrease" + postDecrease);

    System.out.println("n=" + n);

    // String +=
    String str = "hello";
    str += " world";
    System.out.println(str);
  }
}
