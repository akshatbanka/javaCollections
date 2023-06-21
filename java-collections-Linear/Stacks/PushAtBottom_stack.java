import java.util.Stack;
public class PushAtBottom_stack {
    public static void push_bottom( Stack <Integer> s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        push_bottom(s,data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack <>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s);
        push_bottom(s,50);
        System.out.println(s);
    }
  

}
