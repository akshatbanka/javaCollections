import java.util.*;

import java.util.concurrent.*;
class SynchronizedHashMap{
public static void main(String args[]){
System.out.println("Synchronization using Synchronized HashMap : ");
Map<Integer,String> m1 = new HashMap<Integer,String>();
m1.put(1,"ab");
m1.put(2,"cd");
m1.put(3,"ef");
Map<Integer,String> synm1 = Collections.synchronizedMap(m1);
System.out.println(synm1);

System.out.println("Synchronization using concurrentHashMap : ");
ConcurrentHashMap <Integer,String> conm2 = new ConcurrentHashMap<>();
conm2.put(4,"op");
conm2.put(5,"nm");
conm2.put(6,"xz");
System.out.println(conm2);

System.out.println("Synchronization using Hashtable       : ");
Hashtable <Integer,String> ht = new Hashtable<Integer,String>(m1);

for(Map.Entry<Integer,String> en1 : ht.entrySet()){
    
System.out.println(en1.getKey()+" "+en1.getValue());

}
}
}