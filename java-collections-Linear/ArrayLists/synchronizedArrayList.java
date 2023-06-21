import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
class synchronizedArrayList {
    public static void main(String[] args) {
System.out.println("Synchronization using collections.synchronizedList");
List<Integer> ar = Collections.synchronizedList(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)));
synchronized(ar){
Iterator<Integer> it = ar.iterator();
while(it.hasNext()){
System.out.print(it.next()+" ");
}System.out.println();
}

System.out.println("Synchronization using CopyOnWriteArrayList");
CopyOnWriteArrayList<Integer> ar2 = new CopyOnWriteArrayList<Integer>(Arrays.asList(6,7,8,9,10));

Iterator<Integer> it2= ar2.iterator();
while(it2.hasNext()){
System.out.print(it2.next()+" ");
}System.out.println();
}
}



