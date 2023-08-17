import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoArrayList {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("abc");
    strings.add("ghi");
    strings.add("def");

    // for-each
    for (String str : strings) {
      System.out.println(str);
    }

    // Stream
    Stream<String> streamstring = strings.stream();
    // Stream.filtering
    streamstring = streamstring.filter(s -> s.startsWith("a"));
    // Stream.forEach
    streamstring.forEach(s -> System.out.println(s)); // abc

    strings.stream() //
        .filter(s -> s.endsWith("i")) //
        .forEach(s -> System.out.println(s)); // ghi

    List<String> strings2 = strings.stream() //
        .filter(s -> s.length() == 3) //
        .collect(Collectors.toList());

    System.out.println(strings2.size()); // 3

    List<Integer> lengths = strings2.stream() //
        .filter(e -> e.startsWith("a") || e.startsWith("d")) //
        .map(e -> e.length()) // Stream<Intrger>
        .collect(Collectors.toList()); // List<Integer>

    lengths.forEach(e -> System.out.println(e)); // 3 3

    strings.stream() //
        .sorted((s1, s2) -> s2.compareTo(s1)) // descending order
        .collect(Collectors.toList())
        .forEach(s -> System.out.println(s)); // ghi def abc

    if (strings2.stream().anyMatch(e -> e.startsWith("a"))) { // true
      System.out.println("one of the elements starts with a");
    }

    // interminate operations:
    // filter(), map(), sorted(), anyMatch()

    // terminated operations:
    // collect(), forEach()

    // Stream can only terminate once,
    // but it may have multiple interminate operations

    List<Person> persons = Arrays.asList(new Person("John", 30), new Person("Mary", 25));

    // stream -> get All the ages from persons
    List<String> names = persons.stream()//
        .map(e -> {
          String word = "words...";
          return e.getName() + word;
        }) // Stream<String>
        .collect(Collectors.toList());

    System.out.println(names.stream().filter(e -> e.startsWith("John")).count()); // 1

    // stream static method
    long l = Stream.of("abc", "defz", "ghivv", "abc") //
        .filter(e -> e.length() == 3) //
        .distinct() //
        .count(); // 1

    Stream.of(1, 2, 3, 4) //
        .map(e -> {
          System.out.println(e);
          return e;
        }).count();

    // .count(); // terminate operation

    Stream<Integer> stream = Stream.of(1, 2, 3, 4) //
        .map(e -> {
          System.out.println(e);
          return e;
        });

    List<Integer> integers = Stream.of(1, 2, 3, 4) //
        .map(e -> {
          System.out.println("map=" + e);
          return 2;
        })
        .collect(Collectors.toList());

    System.out.println(integers);

    int setSize = Stream.of(1, 2, 3, 3) //
        .collect(Collectors.toSet()).size();
    System.out.println(setSize); // 3

    Stream.of(1, 2, 3, 3, 5) //
        .filter(e -> e < 6 && e > 2) //
        .forEach(e -> System.out.println(e)); // 3 3 5

    List<String> animals = Arrays.asList("lion", "tiger", "bear");

    Map<String, Integer> animalMap = animals.stream() //
        .collect(Collectors.toMap(str -> str, str -> str.length()));

    // Loop Map
    for (Map.Entry<String, Integer> entry : animalMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    // Stream.iterate
    Stream.iterate(1, n -> n + 2) //
        .limit(10)
        .forEach(e -> System.out, println(e));
  }

  // Group By

  public static boolean find(List<Person> persons) {
    return persons.stream() // Stream<>
        .filter(e -> e.isElderly()) // Stream<>
        .findFirst() // Optional<Person>
        .isPresent(); // boolean
  }

}
