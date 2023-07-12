public class Conditionals {
  public static void main(String[] args) {
    // if , else if , else
    int i = 10;
    if (i > 9) { // if (event); // asking if i > 9 , execute the block of code
      System.out.println("i=" + i); // i = 10
    }
    // flow control : "if" - "else"
    if (i < 8) { // not fulfill
      System.out.println("i is smaller than 8");
    } else {
      System.out.println("i is larger than 8");
    }

    // "else if"
    if (i > 12) {
      System.out.println("i > 12");
    } else if (i <= 12 && i >= 0) {
      System.out.println("i <= 12 and i = 0");
    }

    int a = 2;
    int b = 5;
    int box = 0;
    if (a > b) {
      box = 10;
    } else {
      box = 19;
    }
    System.out.println("box=" + box);

    int number = 11;
    if (number % 2 == 1) { // checking if number is an odd number
      System.out.println("The number is an odd number");
    } else {
      System.out.println("The number is an even number");
    }

    if (number % 2 == 0) {
      System.out.println("The number is an even number");
    }

    // string
    String str = "Monday";
    if (str.equals("Monday")) {
      System.out.println("Monday");
    }

    if (str.charAt(4) == 'd') {
      System.out.println("yes");
    } else {
      System.out.println("No");
    }
    if (str.length() > 10) {
      System.out.println("length > 10");
    } else {
      System.out.println("legth < 10");
    }
    if (str.equals("Monday") && str.charAt(4) == 'd' || str.length() > 10) {
      System.out.println("waht is the result now?");
    }

    int score = 89;
    char grade = ' ';
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    }
    System.out.println("grade is " + grade);

    // good codeing
    int age = 65;
    boolean isElderly = age >= 65; // true

    // if (age >= 65) { }
    if (isElderly) { // true or false
      System.out.println("yes he is elderly");
    }

    // switch
    // simple Version
    int dayOfWeek = 3;
    String dayName = "";
    switch (dayOfWeek) { // event
      case 1:
        dayName = "Monday";
        break; // exit
      case 2:
        dayName = "Tuesday";
        break; // exit
      case 3:
        dayName = "Wednesday";
        break; // exit
      case 4:
        dayName = "Thursday";
        break; // exit
      case 5:
        dayName = "Friday";
        break; // exit
      case 6:
        dayName = "Saturday";
        break; // exit
      case 7:
        dayName = "Sunday";
        break; // exit
    }
    System.out.println(dayName);

  }

}
