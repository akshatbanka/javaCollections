import java.util.ArrayList;
public class Stack_arrayList {
    public static void main(String args[]){
        stack s = new stack();
      
       System.out.println(s.isEmpty());
       System.out.println(s.pop());
       System.out.println(s.peek());
       s.push(10);
       s.push(20);
       s.push(30);
       s.push(40);
       System.out.println(s.pop());
      System.out.println(s.peek());
      System.out.println(s.isEmpty());

     while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    }
}

 class stack{
   static ArrayList<Integer> al =new ArrayList<>();

public  boolean isEmpty(){
return al.size()==0;
}

public  void push(int x){
    al.add(x);
}

public  int pop(){
    if(al.size()==0){
        return -1;
    }
    int x= al.get(al.size()-1);
al.remove(al.size()-1);
return x;
}

public  int peek(){
    if(al.size()==0){
        return -1;
    }
    return al.get(al.size()-1);
}
 }