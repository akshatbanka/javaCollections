import java.util.*;
public class DuplicateParentheses {

    public static boolean isDuplicate(String str){
        Stack <Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
          char ch = str.charAt(i);
          if(ch==')'){
            int count=0;
            while(s.pop() != '('){
                count++;
            }
            if(count < 1){
                return true;
            }
          }
          else{
            s.push(ch);
          }
        }
        return false;
    }
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter String : ");
String str = sc.nextLine();
boolean isdupli= isDuplicate(str);
System.out.println("is duplicate String "+isdupli);

    }
}
