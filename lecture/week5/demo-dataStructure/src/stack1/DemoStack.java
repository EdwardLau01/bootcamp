package stack1;

import java.util.Stack;

public class DemoStack {

  public static void main(String[] args) {
    // First in last out
    Stack<String> stack1 = new Stack<>();
    stack1.push("abc");
    stack1.push("def");
    System.out.println(stack1.peek()); // def
    System.out.println(stack1.pop()); // def
    System.out.println(stack1.peek()); // abc

    stack1.push("xyz");
    stack1.push("abc2");
    while (!stack1.isEmpty()) {
      System.out.println(stack1.pop()); // abc2, xyz, abc
    }

    // stack
    stack1.add("ijk1");
    stack1.push("fgi");
    stack1.add("ijk2");
    System.out.println(stack1.pop()); // ijk2
    

    
  }
  
}
