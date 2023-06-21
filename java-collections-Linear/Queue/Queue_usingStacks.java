import java.util.*;

public class Queue_usingStacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.empty();
        }

        public static void add(int data) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.empty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue empty");
                return 1;
            }
            return s1.pop();
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue empty");
                return 1;
            }
            return s1.peek();
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
