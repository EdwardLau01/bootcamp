package queue1;

import java.util.PriorityQueue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    PriorityQueue<String> queues = new PriorityQueue<>();
    // First In First Out
    queues.add("hello");
    queues.add("world");
    System.out.println(queues.size()); // 2
    System.out.println(queues.peek()); // hello
    System.out.println(queues.poll()); // hello
    System.out.println(queues.size()); // 1
    System.out.println(queues.peek()); // world
    System.out.println(queues.poll()); // world
    System.out.println(queues.size()); // 0

    queues.add("abc");
    queues.add("def");
    queues.add("xyz");
    System.out.println(queues.remove("def")); // true
    System.out.println(queues.poll()); // abc
    System.out.println(queues.poll()); // xyz

    System.out.println(queues.add("b")); // add()
    System.out.println(queues.add("1")); // add()
    System.out.println(queues.add("a")); // add()
    System.out.println(queues.add("3")); // add()
    System.out.println(queues.add("2")); // add()
    System.out.println(queues.size());
    System.out.println(queues.peek());

    if (queues.contains("ijk")) {
      System.out.println(queues.remove("ijk"));
    }

    PriorityQueue<String> backup = queues;
    while (!queues.isEmpty()) {
      System.out.println(queues.poll());
    }

  }

}
