import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
  public static void main(String[] args) throws Exception {

    List<Book> books = new ArrayList<>();
    books.add(new Book("John"));
    books.add(new Book("Mary"));
    books.add(new Book("Peter"));

    Optional<Book> book = books.stream() // object bool is not null
        .filter(b -> b.author.startsWith("T")) //
        .findAny();

    book.ifPresent(e -> { //
      System.out.println("hello"); //
    });
    // codes ...

    if (book.isPresent()) {
      System.out.println(book.get());
    } else {
      System.out.println("no book found");
    }

    Optional<Book> book2 = Optional.of(new Book("Eric"));

    // Optional<Book> book8 = Optional.of(null); // error
    // book8.isPresent();

    // Optional<Book> book3 = Optional.of(null); // run-time error
    Optional<Book> book4 = Optional.ofNullable(null);
    System.out.println(book4.isPresent()); // false
    Optional<Book> book5 = Optional.ofNullable(new Book("Jenny"));
    Optional<Book> book6 = Optional.empty();
    System.out.println(book6.isPresent()); // false
    // Optional<Book> book7 = null;

    // Optional<Book> -> Book
    Book newbook = book6.orElse(new Book("default")); //
    Book newbook2 = book6.orElseGet(() -> new Book("default")); //
    Book newbook3 = book6.orElseThrow(() -> new Exception());

    if (book6.isPresent())
      System.out.println("null");
  }

  public static Optional<Book> getBook() {
    // get book logic...
    return Optional.empty();
  }

}
