package queue1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    LinkedList<String> queues = new LinkedList<>();
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

    System.out.println(queues.add("4")); // add()
    System.out.println(queues.add("5")); // add()
    System.out.println(queues.add("1")); // add()
    System.out.println(queues.add("3")); // add()
    System.out.println(queues.add("2")); // add()
    System.out.println(queues.size());
    System.out.println(queues.peek());

    if (queues.contains("ijk")) {
      System.out.println(queues.remove("ijk"));
    }

    LinkedList<String> backup = queues;
    while (!queues.isEmpty()) {
      System.out.println(queues.poll());
    }
    System.out.println(backup.size()); // 0

    LinkedList<Integer> queueNum = new LinkedList<>();
    queueNum.add(10);
    queueNum.add(10);
    queueNum.add(9);
    queueNum.add(0);
    queueNum.add(-3);
    queueNum.add(100);

    int countEven = 0;
    int element = 0;
    int size = queueNum.size();
    int i = 0;
    while (i++ < size) {
      element = queueNum.poll();
      if (element % 2 == 0 && ++countEven == 2)
        continue;
      queueNum.add(element);
    }
    System.out.println(queueNum);
  }
}
