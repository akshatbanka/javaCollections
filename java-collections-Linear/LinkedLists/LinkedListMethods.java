public class LinkedListMethods {

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
    public static int size;

//add first element TC=O(1)
    public void add_first(int data) {
        //create new node
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            size++;
            return;
        }
        //new node next -> head
        newnode.next = head;
        size++;
        //assign newnode value to head
        head = newnode;
    }

//add last element TC=(1)
    public void add_last(int data) {
        //create new node
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            size++;
            return;
        }
        //new node -> tail
        tail.next = newnode;
        size++;
        //assign newnode value to tail
        tail = newnode;
    }

//add element in middle TC=O(n) in traversing the index & O(1) in adding the element
    public void add_middle(int idx, int data) {
        Node newnode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        if (idx == 0) {
            add_first(data);
        }
        newnode.next = temp.next;
        size++;
        temp.next = newnode;
    }

//removing first element TC=O(1)
    public void remove_first() {
        if (size == 0) {
            System.out.println("LL is empty");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        }
        head = head.next;
        size--;
    }

//removing last element TC=O(1)
    public void remove_last() {
        if (size == 0) {
            System.out.println("LL is empty");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        size--;
    }
//print linkedlist

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        LinkedListMethods ll = new LinkedListMethods();
        System.out.print("initail LL : ");
        ll.print();
        System.out.print("ll.add_first(1)     : ");
      //  ll.add_first(1);
        ll.print();
        System.out.print("ll.add_first(2)     : ");
       // ll.add_first(2);
        ll.print();
        System.out.print("ll.add_first(3)     : ");
       // ll.add_first(3);
        ll.print();
        System.out.print("ll.add_middle(2, 4) : ");
      //  ll.add_middle(2, 4);
        ll.print();
        System.out.print("ll.add_last(5)      : ");
        ll.add_last(5);
        ll.print();
        System.out.print("ll.add_last(6)      : ");
        ll.add_last(6);
        ll.print();
        System.out.println("size " + size);
        System.out.print("ll.remove_first()   : ");
        ll.remove_first();
        ll.print();
        System.out.println("size " + size);
        System.out.print("ll.remove_last()    : ");
        ll.remove_last();
        ll.print();

        System.out.println("size " + size);

    }
}
