import java.util.ArrayList;
public class pairSum_rotated {
    public static boolean sum(ArrayList <Integer> al, int target){
        int pivot =-1;
        int n=al.size();
        for(int i=0;i<al.size();i++){
            if(al.get(i)>al.get(i+1)){
                pivot =i;
                break;
            }}
            int rp=pivot;
            int lp=pivot+1;
            while(lp !=rp){
                if(al.get(lp)+al.get(rp)==target){
                    return true;
                }
                if(al.get(lp)+al.get(rp)>target){
                    rp=(rp-1+n)%n;
                }
                else{
                    lp=(lp+1)%n;
                }
            }
        
        return false;
    }
     public static void main(String args[]){
         ArrayList<Integer> al = new ArrayList<>();
         al.add(11);
         al.add(15);
         al.add(6);
         al.add(8);
         al.add(9);
         al.add(10);
         System.out.println("Sorted & rotated array : "+al);
         int target = 19;
         System.out.println("Target : "+target);
         System.out.println("Target present : "+sum(al,target));

     }
}
