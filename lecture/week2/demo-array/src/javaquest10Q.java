import java.util.Arrays;
import java.util.Scanner;

// Input a Index Position: 3
// Input a new Value: 120
// Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
// New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
//
// Input a Index Position: 10
// Input a new Value: 120
// Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
// New Array: [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
//
// Question:
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the inputted index is the last index + 1, return the original array
public class javaquest10Q {

  public static void main(String[] args) {

    int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    // code here
    int[] newArray = my_array;
    //int[] newArray = new int [my_array.length];
    int a = 0; 
    for (int i = 0; i < newArray.length; i++) {
      // if (i < indexPosition){
      //   newArray[i] = my_array[i]; 
      // }
      if ( i == indexPosition){
        newArray[i] = newValue;
      }
      if (i > indexPosition){
        newArray[i] = my_array[indexPosition + a++];
      }
      }
      //my_array = newArray;
    System.out.println("New Array: " + Arrays.toString(my_array));
  }
  }