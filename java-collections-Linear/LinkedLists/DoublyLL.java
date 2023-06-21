public class DoublyLL{

    public class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void add_first(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public static void remove_last() {
        if (head == null) {
            System.out.println("DLL is empty");
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        DoublyLLaddfirst dll = new DoublyLLaddfirst();
        dll.add_first(1);
        dll.add_first(3);
        dll.add_first(2);
        dll.add_first(4);
        dll.print();
        dll.remove_last();
        dll.print();
    }
}
