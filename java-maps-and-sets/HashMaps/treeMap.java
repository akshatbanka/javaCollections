import java.util.*;
class treeMap{
public static void main(String args[]){
TreeMap <Integer,String> tm1 = new TreeMap <>();
        
tm1.put(1500,"a");
        
tm1.put(1000,"t");
        
tm1.put(2000,"s");
      
tm1.put(4000,"g");
        
tm1.put(3000,"b");
        
System.out.println("key-value for given tree ");

for(Map.Entry<Integer,String> en1 : tm1.entrySet()){
    
System.out.println(en1.getKey()+" "+en1.getValue());
}

System.out.println("Greatest value :"+tm1.lastKey());

System.out.println("Smallest value :"+tm1.firstKey());


Set <Integer> s1 = tm1.headMap(3000).keySet();

System.out.println("Print value less than 3000     :"+s1);


Set <Integer> s2 = tm1.tailMap(3000).keySet();

System.out.println("Print value greater than 3000  :"+s2);


TreeMap <Integer,String> tm2 = new TreeMap<>(Comparator.reverseOrder());

tm2.putAll(tm1);
 
System.out.println("key-value pair in decreasing order ");

for(Map.Entry<Integer,String> en2 : tm2.entrySet()){
    
System.out.println(en2.getKey()+" "+en2.getValue());

}
    


}
}
