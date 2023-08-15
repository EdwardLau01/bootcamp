package hashmap1;

public class Book2 {
  String author;
  String name;
  
  public Book2(String author, String name){
    this.author = author;
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  @Override
  public String toString() {
    return "[" + this.author + " : " + this.name + "]"; 
  }
}

