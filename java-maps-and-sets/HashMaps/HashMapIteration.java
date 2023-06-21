
import java.util.*;

class HashMapIteration{

     
public static void main(String []args){

	     	
HashMap<Integer,String> m1 = new HashMap<Integer,String>();
	     	

m1.put(1,"india");
	     	

m1.put(2,"USA");
	     	

m1.put(3,"Switzerland");
	     	

m1.put(4,null);
	


System.out.println("1)Iteration by using keySet() and values()   : ");	

System.out.print("key   -> ");     	
	     

for(Integer key : m1.keySet() ){
	         

System.out.print(key+" ");}

System.out.println();
	     


System.out.print("Value -> ");
	     

for(String val : m1.values()){
	         

System.out.print(val+" ");
	     

}System.out.println();
	


System.out.println("2)Iteration by  entrySet() using forEach loop: ");	  
	

for(Map.Entry<Integer,String> en : m1.entrySet()){
	    

System.out.println("Key -> "+en.getKey()+" "+"Value ->"+en.getValue());
}

	
	
	     	
    

System.out.println("3)Iteration by  entrySet() using iterator    : ");

Iterator<Map.Entry<Integer,String>> itr = m1.entrySet().iterator();

while(itr.hasNext()){

Map.Entry<Integer,String> en2 = itr.next();

System.out.println("Key -> "+en2.getKey()+" "+"Value -> "+en2.getValue());
}


System.out.println("4)Iteration using Map.forEach() and lambda exp: ");

m1.forEach((k,v)->System.out.println("Key -> "+k+" "+"Value -> "+v));
     
}

}
