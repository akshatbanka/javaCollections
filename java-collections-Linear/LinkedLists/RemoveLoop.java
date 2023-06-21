public class RemoveLoop {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static boolean isLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void remove() {
        Node slow = head;
        Node fast = head;
        boolean isLoop = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isLoop = true;
                break;
            }
        }
        if (isLoop == false) {
            System.out.println("No loop exists to remove");
            return;
        }
        slow = head;
        Node fastprev = null;
        while (slow != fast) {
            slow = slow.next;
            fastprev = fast;
            fast = fast.next;
        }
        fastprev.next = null;
    }

    public static void main(String args[]) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(isLoop());
        remove();
        System.out.println(isLoop());
    }
}
