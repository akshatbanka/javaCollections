public class RemoveNthNodeFromEnd {
    public static class Node{
int data;
Node next;

public Node(int data){
this.data=data;
this.next=null;
}
}
    public static Node head;
   public static Node tail; 
   
    public static int size(){
    Node temp = head;
    int sz=0;
    while(temp != null){
    sz++;
    temp=temp.next;
    }
    return sz;
    }
    public static void removeend_nth(int n){
    int s = size();
    if(head == null){
    System.out.println("LL is empty");
    return;
    }
    if(s ==n){
    head = head.next;
    return;
    }
    Node prev = head;
    int i=1;
    while(i<s-n){
    prev = prev.next;
    i++;
    }
    prev.next = prev.next.next;
    }
    
    public static void print(){
    Node temp=head;
    while(temp != null){
    System.out.print(temp.data+"->");
    temp=temp.next;
    }System.out.println("null");
    }
    public static void main(String args[]){
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    System.out.println(size());
    print();
    removeend_nth(2);
    print();
    }
}
