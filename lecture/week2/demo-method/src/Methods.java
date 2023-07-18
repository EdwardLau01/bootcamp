public class Methods {

  public static void main(String[] args) { // method
    String str = "hello";
    str = str + "world"; //append operation 

    // Approach 1
    System.out.println("hello in print() method.");
    //Approach 2: by method
    print(); // print "hello in print() method."

    //Approach 1
    int x = 10;
    int y = 100;
    int m = x + y; // m = 110
    // Approach 2
    int z = sum(x , y); // z = 110
    int i = sum(1000 , -30); // i = 970
    int j = sum(80 , 30);

    // if (sum(1000 , -30) == 970) { }
    if(i == 970) {
      System.out.println("the sum is 970");
    }

    // call method2
    method2("hello");
    method2("github");

    double circleArea = 5 * 5 * pi();
    System.out.println("circle area=" + circleArea);
  }

  public static void print() {
    System.out.println("hello in print() method.");
  }

  public static int sum(int a , int b) {
    // left int = return type
    // the int inside the bracket are parameters
    int c = a + b;
    return c;
  }

    public static int substract(int x , int y) {
      return x - y;
    }

    public static void method2(String str) {
      if (str == null || "".equals(str)) { // null is not empty, empty -> ""
      return;
      }
      System.out.println("string=" + str); // main logic
    }

    public static double pi() {
      return 3.14159;
    }
  }