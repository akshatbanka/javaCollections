import java.util.ArrayList;

public class frequentElement {
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> alnew = new ArrayList<>();
      
        al.add(2);
        al.add(2); //key 
        al.add(3);
        al.add(2);
        al.add(3);
        al.add(2);
        al.add(3);
        al.add(6);
        al.add(3);
        int key =1;
        int maxcount=0;
        for(int i=key;i<al.size();i++){
            int count =0;
            int curr=al.get(i);
            for(int j=key;j<al.size();j++){
                if(curr==al.get(j)){
                    count++;
                }
            }
             if(maxcount<count){
                 maxcount = count;
                 alnew.add(curr);
             }
        }
System.out.println(alnew.get(alnew.size()-1));

    }
}
