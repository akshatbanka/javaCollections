import java.util.ArrayList;
public class maxInList {
public static int max(ArrayList<Integer> al ){
    int max = Integer.MIN_VALUE;
    for(int i=0;i<al.size();i++){
    if(max<al.get(i)){
        max=al.get(i);
    }
    
    }
    return max;

}
 public static void main(String args[]){
ArrayList<Integer> al = new ArrayList<>();
al.add(1);
al.add(6);
al.add(3);
al.add(9);
al.add(5);
System.out.println("Given ArrayList : "+al);
System.out.println("Max element : "+max(al));
 }   
}
