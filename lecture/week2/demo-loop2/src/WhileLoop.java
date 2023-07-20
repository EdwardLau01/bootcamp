public class WhileLoop {
  public static void main (String[] args) {
    //while
    int count = 0;
    while (count < 5) { //continue condition : true / false
      count++;
    } // count = 5

    boolean isHoliday = false;
    int counter = 0;
    while(!isHoliday) { //Is Not Holiday
      counter ++;
      if (counter >= 6) {
        isHoliday = true;
      }
    }

    int c = 0;
    while (c >=0 && c < 5) {
      System.out.println(c);
      c++;
    } // 5 times

    int a = 0;
    int b = 10;
    while (a < 5 || b > 0) {
      System.out.println("hello");
      a++;
      b++;
    }

    //break
    int k = 0;
    while(k < 6) {
      System.out.println("break: hello");
      k++;
      if ( k > 3) {
        break;
      }
    }

    //continueint
    int j = 0;
    while(j > 6) {
      j++;
      if (j > 3) {
        System.out.println("continue: hello");
      }
    }




  }
  
}
