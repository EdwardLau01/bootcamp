public class Loop2 {
  public static void main(String[] args) {

    // break
    for (int i = 0; i < 6; i++) { // 0,1,2,3,4,5,6
      for (int j = 0; j < 3; j++) { // 0,1,2,3
        System.out.println("i=" + i + " j=" + j);
        if (i == j) {
          break; // this break statment just break the inner loop
        }
      }
    }

    // i0 j0 , after print out, break the inner loop
    // i0 j1 XXXX
    // i0 j2 XXXX
    // i1 j0
    // i1 j1 , after print out, break the inner loop
    // i1 j2 XXXX
    // i2 j0
    // i2 j1
    // i2 j2 , after print out, break the inner loop
    // i3 j0
    // ........
    // i5 j0
    // i5 j1
    // i5 j2

    // continue

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == j) {
          continue; // skip the rest in inner loop, go to next iteration
        }
        System.out.println("i=" + i + " j=" + j);
        // Means : if (i != j) { System.out.println ( "i=" + i + " j=" + j); }
      }
      // i0 j0 not print out, go to check i0 j1, means go to next iteration
      // i0 j1
      // i0 j2
      // i1 j0
      // i1 j1 XXXX
      // i1 j2
      // i2 j0
      // i2 j1
      // i2 j2 XXXX
      // i3 j0
      // i3 j1
      // i3 j2
      // ........
      // i5 j0
      // i5 j1
      // i5 j2

    }
    ///////////////////////////////////////////////////////////////
    String str = "I love programming. I love Java.";
    System.out.println("str length=" + str.length()); // length : 32
    for (int i = 0; i < str.length(); i++) { // i < 32 (0 - 31)
      System.out.println("Hello");
    }

    // print the index of the frist occurrence of the character 'e'
    // str.charAt(int index)
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'e') {
        System.out.println("the frist 'e' is " + i);
        break;
      }
    }
    // check if 'y' exists int the string
    // found or not found
    boolean found = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'y') {
        found = true;
        break;
      }
    }
    if (found) {
      System.out.println("found");
    } else {
      System.out.println("not found");
    }

    // the number of occurrence of target "a || o" >= 3 , print yes , if not print no

    char target = 'o';
    int count = 0;
    boolean found2 = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        count++;
      }
      if (count >= 3) {
        found2 = true;
        break;
      }
  }
  if (found2) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  
}
}
