import java.util.*;
class HashMethods{
public static void main(String args[]){
HashMap<String,Integer> map1 = new HashMap<String,Integer>();

map1.put("One",1); 

map1.put("Two",2); 

map1.put("Three",3); 

System.out.println("Map 1 :");

for(Map.Entry<String,Integer> en1 : map1.entrySet()){

System.out.println(en1.getKey()+" "+en1.getValue());}



//1.Create a hashmap with initial capacity 30 and load factor 0.5

HashMap<String,Integer> map2= new HashMap<String,Integer>(30,0.5f);

map2.put("Four",4); 
map2.put("Five",5); 
map2.put("Six",6); 

System.out.println("Map2 with initial capacity 30 and load factor 0.5 :");

for(Map.Entry<String,Integer>en2 : map2.entrySet()){

System.out.println(en2.getKey()+" "+en2.getValue());
}



//2.Create hashmap by copying another hashmap
HashMap
<String,Integer> map3 = new HashMap<String,Integer>(map1);

System.out.println("Map3  by copying another hashmap1 :");

for(Map.Entry<String,Integer>en3 : map3.entrySet()){

System.out.println(en3.getKey()+" "+en3.getValue());
}



//3.Insert all key-value of a hashmap into another hashmap

HashMap<String,Integer> map4 = new HashMap<String,Integer>();

map4.putAll(map2);



//4.Add key-value pair only if it is not present in map

System.out.println("Insert all key-value of a Map2 into another Map4 and Add key-value(Seven,7) pair only if it is not present in Map4 using map4.putIfAbsent(Seven,7)");

map4.putIfAbsent("Seven",7);

System.out.println("Resultant Map4 :");

for(Map.Entry<String,Integer>en4 : map4.entrySet()){

System.out.println(en4.getKey()+" "+en4.getValue());
}



//5.Check if the key-value exist in a Hashmap

System.out.println("Check if three present in Map1 :");

System.out.println(map1.containsKey("Three"));

System.out.println("Check if 3 present in Map1 :");

System.out.println(map1.containsValue(3));



//6.Size of Hashmap
System.out.println("Size of Map1 :");

System.out.println(map1.size());



//7.Remove all key-value pair from hashmap
System.out.println("Size of Map1 after clearing all pairs:");

map1.clear();

System.out.println(map1.size());



//8 .Compare two Hashmap
System.out.println("cpmparision of Map3 and Map4 using keySet() :");

System.out.println(map3.keySet().equals(map4.keySet()));

System.out.println("cpmparision of Map3 and Map4 using values() :");

System.out.println(map3.values().equals(map4.values()));









  

   }
}




