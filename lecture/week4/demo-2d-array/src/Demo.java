import java.util.Arrays;
import java.util.Random;

public class Demo {

    int age;

    public static void main(String[] args) throws Exception {
        int[] nums = new int[3];
        // int[] nums -> declaration
        // new int[3] -> initialization
        nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // ew-assignment

        int[][] matrix = new int[3][4]; // new int [row][column];
        // 3 rows * 4 columns
        // 1, 2, 3, 4
        // 5, 6, 7, 8
        // 9, 10, 11, 12

        // random a number and assign to an 2D array (0-12)

        System.out.println(matrix.length); // 3
        System.out.println(matrix[0].length); // 4
        // martix[0] -> return int[]
        // matrix[0][2] -> get the idx 2 from the array of the row 0

        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[0].length; x++) {
                matrix[y][x] = new Random().nextInt(13);
                ;
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        //convert 2D array to 1D array
        int[] arr = new int[matrix.length * matrix[0].length]; // 12
        int idx = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[idx++] = matrix[i][j];
            }
        }
        System.out.println(Arrays.toString(arr));

        // 3D array
        int[][][] arr3d = new int[1][2][3];
        // 4D array
        int[][][][] arr4d = new int[1][2][3][4];

        TestDemo[][] demo = new TestDemo[2][2];
        demo[0][0] = new TestDemo();
        demo[0][1] = new TestDemo();
        demo[1][0] = new TestDemo();
        demo[1][1] = new TestDemo();

        for(int i = 0; i < demo.length; i++){
            for (int j = 0; j < demo.length; j++){
                System.out.println(demo[i][j].age); // 0, print age of each demo object
            }
        }

        String[][] strings = new String[][]{{"abc" , "def"} , {"zxy" , "ijk"}};
        for(int i = 0; i < strings.length; i++){
            for(int j = 0; j < strings[0].length; j++){
                System.out.println(strings[i][j]);
            }
        }
    }
}
