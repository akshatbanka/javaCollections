package shradhaadidi.Linkedlist;
import java.util.LinkedList;

public class IntersectingLL {
    
    public static class Node{
    int data;
    Node next;
    
    public Node(int data){
    this.data=data;
    this.next=null;
    }
    }
    public static Node head1;
    public static Node head2;
    
    public static boolean intersect(Node head1,Node head2){
    Node temp1 = head1;
    Node temp2 = head2;
    while(head1 != null){
    if(temp1.next == temp2.next){
    return true;
    }
    temp1= temp1.next;
    temp2 = temp2.next;
    }
    return false;
    }
   public static void main(String args[]){
   head1 = new Node(1);
   head2 = new Node(7);
   
   Node n1 = new Node(2);
   head1.next=n1;
   
   Node n4 = new Node(5);
   head2.next=n4;
   
   Node n2 = new Node(3);
   n1.next=n2;
   
   Node n5 = new Node(6);
  n4.next= n5;
  n5.next=n2;
   
   Node n3 = new Node(4);
   n2.next=n3;
   n3.next=null;
   
   System.out.println(intersect(head1,head2));
   
   } 
}
