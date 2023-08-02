/*Question : Given an integer n,
 add a dollar sign ("$") and a comma (",") as the thousands separator and return it in string format. */
/*Constraints:

0 <= n <= 231 - 1 */
public class JavaQuest29 {
  public static void main(String[] args) {
    System.out.println(separator(85));// $85
    System.out.println(separator(0));// $0
    System.out.println(separator(1000));// $1,000
    System.out.println(separator(123987405));// $123,987,405
    System.out.println(separator(1239874050));
    System.out.println(separator(12050));
  }

  public static String separator(int n) {
    // code here
    int count = 0;
    Integer temp = n;
    char[] chars = temp.toString().toCharArray();
    StringBuilder result = new StringBuilder("$");
    for(int i = 0 ; i < chars.length; i++) {
      if(i == (chars.length % 3) - 1 && chars.length % 3 !=0 && i < 3 ) {
        result.append(chars[i]).append(",");
        count = -1;
      } else if(count % 3 == 0 && i >= 3 ) {
        result.append(",").append(chars[i]);
      } else {
        result.append(chars[i]);
      }
      count++;
    }
    return String.valueOf(result);
  }
  

}