public class DataType {
    public static void main(String[] args){
    // Number 
    // Declaration
    int num; //int is a way to declare a variable
    // from now on, you can only integer to variable num.
    // Assignment
    num = 3; //If " = " from right to left
    
    // Dclaration + Assignment
    int n = 0;
    n = 10;

    System.out.println("3");
    System.out.println(3);
    System.out.println(num);
    System.out.println(n);

    // Text
    String str = "Hello  ";
    System.out.println(str);
    System.out.println("Hello");

    // String str2 =1; (error)
    // int num2 = "hello"; (error)
    
    
    // Re-assignment, cannot retype Data Type
    num = 10;
    System.out.println(num);
    // Floating point
    // int num3 = 1.1; // Error, int can only store Integer
    double f = 1.03;
    double f2 = 1; //OK
    System.out.println(f2);
    System.out.println(f);

    // byte, short , long
    byte b = 125;
    // byte b2 = 128; //out of range
    byte b3 = -128;
    // byte b4 = -129; //out of range

    short s = 23;
    short s2 = -60;

    long l = 400;
    long l2 = 1000;
    long l3 = 30L; // norm -> L, but not l

    System.out.println(b);

    // Floating point -> double/ float
    float f3 = 1.00000000000003f;
    double d4 = 23.9;

    // char
    char gender = 'M'; // "char" only one word
    char space = ' ';
    // char empty =''; // error, cannot epmty

    // boolean
    boolean isMale = true;
    boolean isSalaryGreaterThan1000 = true;
    boolean isValid = false;

    // initialization, means the 1st time of assignment
    int a10 = 0;
    a10 = 1000;

// byte, short , int , long (only integer)


    // String + operation
    String str1 = "Hello";
    String str2 = " World!";
    String result = str1 + str2;
    System.out.println(result);

    String result2 = "Something1" + " Somethins2";
    System.out.println(result2);

    String str3 = "abc" + 13; // default behaviour; convert 13 to String
    //abc13

    String str4 = "abc" + 'A' + "!@#$%" ; // 'A' -> String "A" 
    char a = 'A';
    String str5  = "abcd" + false + true;
    System.out.println(str5); // abcdfalsetrue

    // String str6 = 13 + 13; // error
    String str7 = " " + 13 + 13; // 13 -> String "13" , 1313
    System.out.println(str7);

    // only number , true and false can no need to add "" or ''


    //
    int a4 = 1 + 3; //4
    int b10 = 1 - 3; //-2
    int c10 = 2 - 80; // -78
    int i = 2 * 101; // 202
    int p = 10 / 3; // 3, "int" only integer
    int o = 10 % 3; // 1, 1 is reminder
    System.out.println(o);
    
  }
}
