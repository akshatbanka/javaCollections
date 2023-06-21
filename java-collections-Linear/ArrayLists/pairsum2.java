import java.util.ArrayList;
public class pairsum2 {
    public static boolean sum(ArrayList<Integer> al,int target){
        int lp=0;
        int rp=al.size()-1;
        while(lp<rp){
            if(al.get(lp)+al.get(rp)==target){
                return true;
            }
            if(al.get(lp)+al.get(rp)>target){
                rp--;
            }
            else{
                lp++;
            }
        }
        return false;
    }
    //tc = O(n)
   public static void main(String args[]){
    ArrayList<Integer> al = new ArrayList<>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    al.add(5);
    al.add(6);
    int target = 10;
    System.out.println("Given ArrayList : "+al);
    System.out.println("Target : "+target);
    System.out.println("Target Present : "+sum(al,target));
   } 
}
