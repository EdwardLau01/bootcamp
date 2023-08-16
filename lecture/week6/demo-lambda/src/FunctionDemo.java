import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
  public static void main(String[] args) {
    Function<String, Integer> lengthFunc = str -> str.length(); // (str) -> str.length()
    Function<String, Character> firstCharFunc = str -> str.charAt(0);

    System.out.println(lengthFunc.apply("abc")); // 3
    System.out.println(firstCharFunc.apply("abc")); // a

    LengthFuction lengthFuction = new LengthFuction();
    System.out.println(lengthFuction.apply("def")); // 3

    Map<String, String> map = new HashMap<>();
    map.put("abc", "Mary");
    // Function<String,String> formula = s -> "default";
    String result = map.computeIfAbsent("abc", s -> "default");
    System.out.println(result); // Mary
    System.out.println(map.size()); // 1

    String result2 = map.computeIfAbsent("def", s -> "default");
    System.out.println(result2); // default

    System.out.println(map.size()); // 2, put ("def" , "default")

    // BiFunction
    BiFunction<Integer, Integer, BigDecimal> addition = //
        (x, y) -> BigDecimal.valueOf(x + y);
    System.out.println(addition.apply(-4, 3).abs()); // -1 -> abs -> 1

    Map<String, Integer> stock = new HashMap<>();
    stock.put("clothes", 100);

    stock.compute("clothes", (item, oldPrice) -> (int) (oldPrice - oldPrice * 0.1));
    System.out.println(stock.get("clothes")); // 90

    // new value: null, remove item
    stock.compute("clothes", (item, oldPrice)->null);
    System.out.println(stock.size()); // 0

    //
    stock.compute("shoes", (item, oldPrice)-> 120);
    System.out.println(stock.get("shoes")); // 120

  }

  // map.compute("bcd", (s1, s2) -> "value");
  // System.out.println(map.size()); // 3
  // System.out.println(map.get("bcd")); // value
  // map.compute("bcd", (s1, s2) -> "another value");
  // System.out.println(map.size()); // 3
  // System.out.println(map.get("bcd")); // another value

  // map.compute("bcd", (s1, s2) -> null);
  // System.out.println(map.size()); // 2

}
