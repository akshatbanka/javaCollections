public class Stack_LinkedList {
    
    public static void main(String args[]){
        stack s = new stack();
       s.push(10);
       s.push(20);
       s.push(30);
       s.push(40);
       s.printstack();

    }
}

 class stack{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }}
        Node head = null; 

    public  boolean isEmpty(){
        return head==null;
    }

    public  void push(int data){
        Node newnode = new Node(data);
        if(head ==null){
            head = newnode;
            return;
        }
        newnode.next=head;
        head = newnode;
    }

    public  int pop(){
        if(head ==null){
            return -1;
        }
       int top = head.data;
        head = head.next;
        return top;
    }

    public  int peek(){
        if(head ==null){
            return -1;
        }
        return head.data;
    }

    public void printstack(){
        Node temp=head;
        while(temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}