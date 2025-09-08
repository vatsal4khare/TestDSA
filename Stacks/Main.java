package Stacks;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(17);
        stack.push(55);
        stack.push(8);

        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(8);
        queue.add(10);
        System.out.println(queue.peek());
        System.out.println(queue.remove());

        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(3);
        dq.addLast(6);
        dq.removeFirst();
        System.out.println(dq.peek());

    }
}
