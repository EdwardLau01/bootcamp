package hashmap1;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap2 {
  public static void main(String[] args) {
    HashMap<Integer, Book2> books = new HashMap<>();
    // key = Address of Byte or value of Byte?
    books.put(128, new Book2("dummy","book1"));
    books.put(128, new Book2("dummy","book2"));
    System.out.println(books.size());

    HashMap<Author, Book2> bookMap = new HashMap<>();
    // Author unqiue key? -> equals(), hashCode()
    Author author1 = new Author("John", 30);
    Author author2 = new Author("John", 29);
    bookMap.put(author1, new Book2("dummy","book3"));
    bookMap.put(author2, new Book2("dummy","book3"));
    System.out.println(bookMap.size()); // 1

    //ArrayList<ArrayList<String>> strs = new ArrayList<>();

    HashMap<Author, ArrayList<Book2>> bookMap2 = new HashMap<>();
    ArrayList<Book2> bookList1 = new ArrayList<>();
    bookList1.add(new Book2("dummy","book1"));
    bookList1.add(new Book2("dummy","book2"));

    ArrayList<Book2> bookList2 = new ArrayList<>();
    bookList2.add(new Book2("dummy","book3"));
    bookList2.add(new Book2("dummy","book4"));

    bookMap2.put(author1, bookList1);
    bookMap2.put(author2, bookList2);

    // Loop bookMap2, print out all the books from each Author
    for (HashMap.Entry<Author, ArrayList<Book2>> entry : bookMap2.entrySet()) {
      // System.out.println(author.getKey().name);
      for(Book2 book : entry.getValue()) {
        System.out.println("Author Name:" + entry.getKey().name//
        + ", Book Name:" + book.getName());
      }
    }

    for (Book2 book : bookMap2.get(new Author("John", 0))) {
      System.out.println(book);
    }

  }
}
