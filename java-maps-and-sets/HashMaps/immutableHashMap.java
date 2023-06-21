import java.util.*;
class immutableHashMap{
public static void main(String args[]){
Map<Integer,String> m1 = new HashMap<Integer,String>();
	     
m1.put(1,"one");
	     
m1.put(2,"two");
	     
m1.put(3,"three");
         
System.out.println("Immutable hashMap using Collections.unmodifiable() method before java9 : ");
         
m1 = Collections.unmodifiableMap(m1);
         
System.out.println(m1);
         
// m1.put(4,"four"); UnsupportedOperationException;
         
         
System.out.println("Immutable hashMap using java9 with factory methods : ");
         
Map<Integer,String> m2 = Map.ofEntries(Map.entry(4,"four"),Map.entry(5,"five"),Map.entry(6,"six"));
             
System.out.println(m2);
}
}