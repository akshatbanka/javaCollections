import java.util.*;
public class ReverseString {

    public static StringBuilder reverse(String str){
        Stack<Character> s = new Stack <>();
        int idx =0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res = new StringBuilder(" ");
        while(!s.empty()){
            char curr = s.pop();
            res.append(curr);
        }
        return res;
    }

public static void main (String args[]) {
Scanner sc = new Scanner (System.in);
System.out.print("Enter string : ");
String str = sc.nextLine();
System.out.println("Reversed string : "+reverse(str));

    }
}
