public class StringBox { // Class

  private String string; // String -> Class
  private String string2;

  public StringBox() {

  }

  public StringBox(String string) {
    if (string == null){
      this.string = "";
    }
    this.string = string;
  }

  public StringBox(String string, String string2) {
    if (string == null){
      this.string = "";
    }
    if (string2 == null){
      this.string2 = "";
    }
    this.string = string;
    this.string2 = string2;
  }

  public void setString2(String string2) {
    this.string2 = string2;
  }

  public String getString2() {
    return this.string2;
  }

  public void setString(String string) {
    this.string = string;
  }

  public String getString() {
    return this.string;
  }

  public StringBox append(String str) {
    if( str == null || "".equals(str)){ //**************
      return this;
    }
    this.string = this.string + str;
    // return this.string;
    return this; // StringBox Object
  }
  public static StringBox append(String str , String str2) {
    return new StringBox (str + str2);
  }

  public StringBox append2(String str) {
    this.string2 = this.string2 + str;
    // return this.string;
    return this; // StringBox Object
  }

  /**
   * 
   * @param idx Range
   * @param s The string to be inserted
   * @return Object of StringBox
   */
  public StringBox insert(int idx, String s) { 
    if (idx < 0 || idx > this.string.length()){
      return this;
    }
    if (s == null || "".equals(s)){
      return this;
    }
    this.string = this.string.substring(0, idx) + this.string.substring(idx);
    return this;
  }

  public String toString1() {
    return this.string;
  }

  public String toString2() {
    return this.string2;
  }

  public static void main(String[] args) {
    StringBox s = new StringBox();
    s.setString("Java1");
    s.setString2("java2");
    System.out.println(s.append2("Python2"));
    System.out.println(s.append("Python1"));

    StringBox s2 = new StringBox();
    
    String s4 = StringBox.append("hello", " world").toString();
  }

}