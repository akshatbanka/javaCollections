import java.util.*;
class LinkedHashMap {
public static void main(String args[]){
HashMap<Integer,String> m1 = new HashMap<Integer,String>();

m1.put(1,"one");
m1.put(2,"two");
m1.put(3,"three");
m1.put(4,"four");
m1.put(5,"five");


LinkedHashMap<Integer,String> lm1 = new LinkedHashMap<Integer,String>();

lm1.putAll(m1);


System.out.println("Given LinkedHashMap :");

for(Map.Entry<Integer,String> en1 : lm1.entrySet()){
    
System.out.println(en1.getKey()+" "+en1.getValue());

}

System.out.println("Size of linkedhashmap: "+lm1.size());

System.out.println("contains key 3       : "+lm1.containsKey(1));

System.out.println("contains vlaue three : "+lm1.containsValue("three"));

System.out.print("remove (1,one)         :");

lm1.remove(1);

System.out.println(lm1);
  
  }
}
