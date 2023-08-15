import java.util.Arrays;

public class TestDemo {
  public static void main(String[] args) {

    // int[] temp = new int[]{1,3,6,2,7,5,4,9,78,7,5,3,0};

    // Arrays.sort(temp);
    // Arrays.parallelSort(temp);
    // System.out.println(Arrays.toString(temp));
    int count = 0;
        String s = "SD F GH AA A";
        String j = "ASD";
        for(int i = 0; i < j.length(); i++){
            // s = s.replace(j.charAt(i) , '1');
        }
        System.out.println(s.split(" ").length); 


        int x = 0;

        int y = (++x + 3) * ++x;

        System.out.println(y);

        x = 3;
        y = 4;

        int z = x > y ? x : y ;

        System.out.println(z);

        x = 128;
        y = 128;
        System.out.println(x == y); // true

        Integer x2 = x;
        Integer y2 = y;
        System.out.println(x2 == y2); // false

        x2 = 127;
        y2 = 127;
        System.out.println(x2 == y2); // true

        x2 = new Integer(127);
        System.out.println(x2 == y2);

        Boolean bool = true;
        Boolean bool2 = true;
        System.out.println(bool == bool2);

        bool = new Boolean (true);
        System.out.println(bool == bool2);


  }
}
