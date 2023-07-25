public class Maths {
  public static void main(String[] args) {
    System.out.println(Math.round(5.4)); // 5
    System.out.println(Math.round(5.5)); // 6
    System.out.println(Math.round(5.44)); // 5
    System.out.println(Math.round(5.45)); // 5
    System.out.println(Math.pow(4 ,2)); // 16
    System.out.println(Math.sqrt(26)); // 5.0990195135927845
    System.out.println(Math.sqrt(-26)); // NaN

    int num = -25;
    if(num > 0 && Math.sqrt(num) == 5) { // if num <= 0, exit
      //dosomthing
    }

    Math.random(); // 0.0 - 1.0

    // base10:
    // log10 -> 1
    // log1000 -> 3

    // base3:
    // log8 -> 3

    double number = 2.0;
    double naturalLog = Math.log(number);
    System.out.println(naturalLog);

    System.out.println(Math.log10(10));

    int [] nums = new int [] {-100 , 100 , 90 , 50};
    double d = 0;
    for ( int i = 0; i < nums.length ; i ++) {
      d += Math.abs(nums[i]);
    }
    System.out.println((int)d);

    double []arr = new double[] { -5.64, 5.23, 9.800, 6.55};
    int sum = 0;
    for ( int i = 0; i < arr.length; i++) {
      sum = sum + (int)Math.round(Math.abs(arr[i]));  //
    } 
    System.out.println(sum);

    int cubeLength = 3;
    double volume = Math.pow(cubeLength , 3);
    System.out.println(volume);

    int[] bases = new int[] { 2, 3, 4, 5};
    int[] index = new int[] { 3, 4, 5, 6};
    int[] result = new int[bases.length];

    for (int i = 0; i < bases.length; i++) {
      result[i] = (int)Math.pow(bases[i] , index[i]);
    }

    for(int x : result) {
    System.out.println(x);
    }


  }
  
}
