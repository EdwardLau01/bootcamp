import java.util.function.Function;

public class LengthFuction implements Function<String, Integer> {

  @Override
  public Integer apply(String str) {
    return str.length();
  }
  
}
