import java.util.*;

class arrayIntoArrayList{

public static void main(String[] args) {
System.out.println("Conversion of Array into ArrayList");
  
Integer a[]  =  {1,2,3,4,5};
      
List<Integer> l1 = Arrays.asList(a);
   
System.out.println("Conversion using Arrays.asList()          : "+l1);
 
List<Integer> l2 = new ArrayList<Integer>();
       
Collections.addAll(l2,a);
          
System.out.println("Conversion using Collections.addAll(,)    : "+l2);
     
List<Integer> l3 = new ArrayList<Integer>();
      
for(Integer i : a){
    
l3.add(i);}
     
System.out.println("Manual conversion using forEach loop       : "+l3);
   
   }
     }
	
