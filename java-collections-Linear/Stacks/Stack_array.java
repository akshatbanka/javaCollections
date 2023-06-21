public class Stack_array {
  public static void main(String args[]){
stack s = new stack();
s.push(10);
s.push(20);
s.push(30);
s.push(40);
System.out.println("stack is Empty : "+s.isEmpty());
System.out.println("peek element : "+s.peek());
s.pop();
System.out.println("peek element after pop : "+s.peek());

while(!s.isEmpty()){
    System.out.println(s.peek());
    s.pop();
}
System.out.println("stack is Empty : "+s.isEmpty());
  }  
}
 class stack {
int size=5;
int arr[]=new int[size];
int top = -1;

void push(int x){
    top++;
    arr[top]=x;
    
}

int  pop() {
    if(top<0){
        return -1;
    }
    int x = arr[top];
    top--;
    return x;
}

int peek(){
    if(top<0){
        return -1;
    }
    return arr[top];
}

boolean isEmpty(){
if(top<0){
    return true;
}
return false;
}


 }