public class addMiddleNode {

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

    public static void add_first(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        }
        newnode.next = head;
        head = newnode;
    }

    public static void add_last(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static  void add_middle(int idx, int data) {
        Node newnode = new Node(data);
        if (idx == 0) {
            add_first(data);
            return;
        }
        Node prev = head;
        int i = 1;
        while (i <= idx - 1) {
            prev = prev.next;
            i++;
        }
        
        newnode.next = prev.next;
        prev.next = newnode;
    }

    public static void main(String args[]) {
        add_first(1);
        add_first(2);
        add_last(4);
        add_last(5);
        add_middle(2,3);
        print();
    }
}
