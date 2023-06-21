import java.util.ArrayList;
import java.util.Collections;

public class LonleyList {
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> alnew = new ArrayList<>();
        al.add(1);
        al.add(3);
        al.add(5);
        al.add(3);

        Collections.sort(al);
        for (int i = 0; i < al.size(); i++) {
            int curr = al.get(i);

            if (i == 0) { //first idx
                if(al.get(i+1)==curr){
                    
                }
                if (al.get(i + 1) != curr+1 ) {
                    alnew.add(curr);
                }
            } else if (i == al.size() - 1  ) { //last idx
                                        if (al.get(i-1) != curr-1 ) {
                    alnew.add(curr);
                }
            } else if (al.get(i + 1) != curr + 1 && al.get(i - 1) != curr - 1 ) { //6, i=1; i=2,7 || i=0,5 //5 6 8 10

                alnew.add(curr);
            }


        }

        System.out.println(alnew);
    }
}
