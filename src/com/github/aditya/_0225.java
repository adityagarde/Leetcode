package com.github.aditya;

import java.util.LinkedList;
import java.util.Queue;

public class _0225 {
    // 0 ms, faster than 100.00%, memory 40 MB, less than 91.87%
    // Implementing Stack with 2 Queues
    class MyStack {
        Queue<Integer> queue1;
        Queue<Integer> queue2;

        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        public void push(int x) {
            while (!queue1.isEmpty())
                queue2.offer(queue1.poll());

            queue1.offer(x);

            while (!queue2.isEmpty())
                queue1.offer(queue2.poll());
        }

        public int pop() {
            return queue1.poll();
        }

        public int top() {
            return queue1.peek();
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }
}