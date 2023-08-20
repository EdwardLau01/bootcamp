import java.util.HashSet;
import java.util.Set;

public class DemoRecord {
    public static void main(String[] args) throws Exception {
        Person person = new Person("john", 30);

        Person1 person1 = new Person1("tom", 40);
        Person1 anotherPerson1 = new Person1("tom", 40);

        System.out.println(person.getName()); // john
        System.out.println(person.getAge()); // 30
        System.out.println(person1.name()); // tom
        System.out.println(person1.age()); // 40

        // HashMap(), Set -> equals(), hashCode

        Set<Person1> set = new HashSet<>();
        set.add(person1);
        System.out.println(set.add(anotherPerson1)); // false

        System.out.println(person1.equals(anotherPerson1)); // true
        System.out.println(person1); // Person1[name=tom, age=40]

        System.out.println(person1.hashCode() == anotherPerson1.hashCode()); // true
        
    }
}
