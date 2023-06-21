import java.util.ArrayList;
public class containMaxWater {
    public static int storewater(ArrayList<Integer> al){
        int maxwater=0;
        int lp=0;
        int rp=al.size()-1;

        while(lp<rp){
            int height = Math.min(al.get(lp),al.get(rp));
            int width = rp-lp;
            int currwater = height * width;
            maxwater = Math.max(maxwater,currwater);
            if(al.get(lp)<al.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String args[]){
ArrayList<Integer> al = new ArrayList<>();
al.add(1);
al.add(8);
al.add(6);
al.add(2);
al.add(5);
al.add(4);
al.add(8);
al.add(3);
al.add(7);
System.out.println("Given height     : "+ al);
System.out.println("Max water stored : "+storewater(al));
}

   }

