public class PalindromeLL {

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

    public static Node find_mid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node mid = find_mid(head);
        //reverse
        Node curr = mid;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while (right != null && left != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String args[]) {
        head = new Node(2);
        head.next = new Node(1);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        System.out.println(isPalindrome());
    }
}
