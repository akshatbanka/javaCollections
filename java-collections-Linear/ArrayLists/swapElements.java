import java.util.ArrayList;
public class swapElements {
    public static void swap(ArrayList<Integer> al,int idx1,int idx2){
int temp=al.get(idx1);
al.set(idx1,al.get(idx2));
al.set(idx2,temp);
System.out.println(al);
    }
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);  
        System.out.println("Given arrayList : "+al);
        System.out.print("Swapped arrayList : ");
        swap(al,0,2);

    }
 
}
