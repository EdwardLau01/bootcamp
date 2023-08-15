package queue1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class DemoArrayDeque {
  public static void main(String[] args) {
    ArrayDeque<String> strings = new ArrayDeque<>();
    strings.add("abc");
    strings.add("def");
    strings.add("abc");
    System.out.println(strings.poll()); // abc
    System.out.println(strings.size()); // 2
    strings.addLast("xyz"); // addLast() = add()
    System.out.println(strings.poll()); // def
    strings.addFirst("ijk"); // head
    System.out.println(strings.peek()); // ijk
    strings.pollFirst(); // ijk, pollFirst() = poll
    strings.pollLast(); // xyz

    Queue<Integer> int10 = new LinkedList<>();
    int10.add(11);
    int10.add(12);
    int10.add(13);
    System.out.println(int10);
    System.out.println(int10.poll().intValue());
    System.out.println(int10);
    int x = 0;
    x = int10.poll();
    System.out.println(x);
    System.out.println(int10);
    x = int10.poll().intValue();
    System.out.println(x);

    Queue<String> queue = new LinkedList<>();
    Deque<String> deque = new LinkedList<>();

    queue.addAll(deque);
    queue.add(null);
    deque.addAll(deque);
    deque.add(null);
    deque.addFirst(null);
    deque.addLast(null);

    run1(new LinkedList<>()); // linkedlist
    run1(new ArrayDeque<>()); // array
    // run1(new PriorityQueue<>()); // complie-error

    run2(new LinkedList<>()); // linkedlist
    run2(new ArrayDeque<>()); // array
    run2(new PriorityQueue<>());

    Collection<String> arrayList = new ArrayList<>();

    List<String> list = new LinkedList<>(); // hide deque method

    
  }

  public static void run1(Deque<String> deque) {
    deque.addFirst("ss");
    deque.addLast("ss");
  }

  public static void run2(Queue<String> queue) {
    queue.add("ss");
    queue.add("ss");
  }

  public static int run3(Collection<String> collection) {
    collection.add("ss");
    collection.add("ss");
    return collection.size();
  }

}
