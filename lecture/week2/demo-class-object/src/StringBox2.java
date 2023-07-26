import java.util.Arrays;

public class StringBox2 {

  char[] string;

  public StringBox2() {

  }

  public StringBox2(char[]sources) {
    // approach 1
    // this.string = new char[sources.length];
    // int i = 0;
    // for (char x : sources) {
    //   string[i] = x;
    //   i++;
    // }

    // approach 2
    this.string = Arrays.copyOf(sources, sources.length); // make difference address 
  }

  public StringBox2 append(String s){
    // string -> toCharArray()
    char[] res = new char[this.string.length + s.length()];
    int idx = 0;
    int j = 0;
    while (idx < this.string.length) {
      res[idx] = this.string[j];
      idx++;
      j++;
    }
    j = 0;
    while (j < s.length()) {
      res[idx] = s.charAt(j);
      idx++;
      j++;
    }
    this.string = res;
    return this;

  }

  public void setString(char[] string) {
    this.string = string;
  }

  public char[] getString() {
    return this.string;
  }

  public String toString(){
    return Arrays.toString(this.string);
    //return String.valueOf(this.string); // [a , b , c] -> abc
  }

  public static void main(String[] args) {
    char[] chars = new char[] { 'a', 'c', 'b' };

    StringBox2 box = new StringBox2(chars);
    System.out.println(box.toString());

    chars[1] = 'x';
    System.out.println(Arrays.toString(chars)); // a , x , b
    System.out.println(box.toString()); // a , c , b
    
    System.out.println(box.append("def").toString());

  }

}
