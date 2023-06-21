import java.util.*;

class ArrayListIntoArray
{


public static void main(String[] args) 
{
System.out.println("Conversion of ArrayList into Array");

ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

System.out.println("Given ArrayList   : "+al1);

Integer [] a= new Integer[al1.size()];

al1.toArray(a);

System.out.print("Coverted Array    : ");

for(Integer i:a){
    
System.out.print(i+" ");

}

   
}
     }
	

