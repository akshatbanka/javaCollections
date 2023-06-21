import java.util.*;
public class ValidParentheses{

public static boolean isValid(String str){
Stack <Character> s = new Stack<>();
for(int i=0;i<str.length();i++){
Character ch = str.charAt(i);
if(ch=='(' || ch=='{' || ch == '['){
s.push(ch);
}
else {
    if(s.empty()){ //all closing bracket
        return false;
    }
    if(s.peek()=='(' && ch==')' || s.peek()=='{' && ch=='}' || s.peek()=='['&& ch==']'){
        s.pop();
    }
    else { //all opening bracket
        return false;
        }
}
}

if(s.empty()){
   return true;
}
else{
    return false;
}
}
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter String : ");
 String str = sc.nextLine();
 Boolean valid = isValid(str);
 System.out.println("is valid "+valid);
}
}