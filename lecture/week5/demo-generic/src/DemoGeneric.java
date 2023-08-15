import java.util.ArrayList;

import zoo.Animal;
import zoo.Cat;
import zoo.Dog;
import zoo.Zoo;

public class DemoGeneric {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();

        // Animal Example

        Zoo<Dog> zoo1 = Zoo.of(Dog.of("zyx"));
        // zoo1.setAnimal(new Cat()); // compile error , strong type check
        zoo1.setAnimal(Dog.of("def"));

        Zoo<Animal> zoo2 = Zoo.of(new Cat());
        zoo2.setAnimal(new Animal());
        zoo2.setAnimal(Dog.of("abc"));
        zoo2.setAnimal(new Cat());

        // Zoo<String> zoo3 = Zoo.of("zyx"); // String is not extends Animal

        Integer a = 100;
        Box<Integer> box = getBox(100);
        Object object = getBox(Double.valueOf(1.0d));
        // Object object <- Box<Double>
        Box<Double> d1 = (Box<Double>) object;

        for (double d : d1.getNumbers()) {
            System.out.println(d);
        }

    }

    public static <T extends Number> Box<T> getBox(T element) {
        return new Box<>(element);
    }
}
