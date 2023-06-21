public  class Queue_usingLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class Queue {
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void add(int data) {
            Node newnode = new Node(data);
            if (isEmpty()) {
                head = tail = newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }

        public static int remove(){
          if(isEmpty()){
            System.out.println("queue empty");
            return -1;
          } 
          int front = head.data;
          if(head == tail){
            head=tail=null;
          }
          else{
            head=head.next;
          }

          return front;

        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;
              } 
          return head.data;      
        }

    }


    public static void main(String args[]) {
Queue q = new Queue();
System.out.println(q.isEmpty());
q.add(5);
q.add(6);
q.add(7);
q.add(8);
q.add(9);

while(!q.isEmpty()){
    System.out.println(q.peek());
    q.remove();
}
    }
}
