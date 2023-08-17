import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleGpt {
    // In this example, we have a list of names: "John", "Jane", "Adam", "Eva",
    // "Mike", and "Emily".

    // Example 1 demonstrates filtering the names that start with the letter "J"
    // using the filter intermediate operation. The filtered names are then printed
    // using the forEach terminal operation.

    // Example 2 showcases mapping each name to its length using the map
    // intermediate operation. The lengths are collected into a new list using the
    // collect terminal operation with Collectors.toList().

    // Example 3 shows the chaining of multiple operations. First, we filter out
    // names with a length greater than 4 characters. Then, the filtered names are
    // sorted in alphabetical order using the sorted intermediate operation.

    // Finally, we limit the result to the first three names using the limit
    // intermediate operation. The resulting names are collected into a new list and
    // printed.
    
    // The Stream API provides a wide range of operations that can be combined and
    // customized based on your specific requirements. By chaining these operations
    // together, you can create powerful data processing pipelines with concise and
    // readable code.
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Adam", "Eva", "Mike", "Emily");

        // Example 1: Filtering names starting with "J" and printing them
        names.stream()
                .filter(name -> name.startsWith("J"))
                .forEach(System.out::println);

        // Example 2: Mapping names to their lengths and collecting into a new list
        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(nameLengths);

        // Example 3: Chaining multiple operations - filtering, sorting, and limiting
        List<String> filteredAndSortedNames = names.stream()
                .filter(name -> name.length() <= 4)
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(filteredAndSortedNames);
    }
}