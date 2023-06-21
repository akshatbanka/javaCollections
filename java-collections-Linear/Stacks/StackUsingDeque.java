import java.util.*;

public class StackUsingDeque {
    static class Stack {
        Deque<Integer> dq = new LinkedList<>();

        public boolean empty() {
            return dq.isEmpty();
        }

        public void push(int data) {
            dq.addLast(data);
        }

        public int pop() {
            return dq.removeLast();
        }

        public int peek() {
            return dq.getLast();
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
