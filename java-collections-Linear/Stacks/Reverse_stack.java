import java.util.*;
public class Reverse_stack{ 

public static void push_bottom(Stack<Integer> s,int data){
if(s.empty()){
s.push(data);
return;
}
int top = s.pop();
push_bottom(s,data);
s.push(top);
}

public static void reverse(Stack<Integer>s){
    if (s.empty()){
        return;
    }
int top=s.pop();
reverse(s);
push_bottom(s,top);
}
public static void main(String args[]){
Stack<Integer> s = new Stack<>();
s.push(1);
s.push(2);
s.push(3);
System.out.println("Given stack    : "+s);
reverse(s);
System.out.println("Reversed stack : "+s);
}
}