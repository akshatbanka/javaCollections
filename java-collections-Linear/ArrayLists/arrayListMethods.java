import java.util.*;
public class arrayListMethods {

    public static void main(String []args) {
        System.out.print("ArrayList one : ");
        ArrayList <Integer> ar1= new ArrayList <Integer>(Arrays.asList(1,2,3,4,4,5,6,7));

        System.out.println(ar1);
        System.out.print("ArrayList two : ");
        ArrayList <Integer> ar2 = new ArrayList <Integer>(Arrays.asList(5,6,7,7,7));
        System.out.println(ar2);

//1.addAll() -> adds all elements of ar1 into ar2 from starting index 2
        ar2.addAll(2,ar1);
        System.out.println(" ar2.addAll(2,ar1) :"+ar2);
//2.clear() -> will clear all elements present in ar2
        ar2.clear();
        System.out.println("ar2.clear()        :"+ar2);
//3.contains() -> return a boolean value to check if the value is present in the list or not
        System.out.println("ar1.contains(3)    :"+ar1.contains(3));
//4.indexOf() ->prints resultant index of passed element
        System.out.println("ar1.indexOf(4)     :"+ar1.indexOf(4));
//5.lastIndexOf() -> prints last index of passed element
        System.out.println("ar1.lastIndexOf(4) :"+ar1.lastIndexOf(4));
//6.remove() -> removes element present on the passed index
        ar1.remove(3);
       System.out.println("ar1.remove(3)      :"+ar1);
//7.size() -> returns the size of ArrayList
        System.out.println("Size of ar1        :"+ar1.size());
//8.removeif() -> removes particular elements based on passed condition
        ar1.removeIf(num -> num%2==0);
        System.out.println("Removing even elements :"+ar1);
//9.sublist() -> returns List having subelements starting and ending from passed index
        List<Integer>sub= ar1.subList(0,2);
        System.out.println("Sublist of ar1         :"+sub);

        ArrayList<Integer> ar3 = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,1));
        System.out.println("ArrayList three        :"+ar3);
//10.Collections.sort() -> sorts passed Arraylist
        Collections.sort(ar3);
        System.out.println("Sorted ArrayList three :"+ar3);
//11.equal() -> retruns boolean to check if the arrayList are equal or not 
        boolean equal = ar3.equals(ar1);
        System.out.println("Are ar1 and ar3 equal? :"+equal);
//12.removesAll -> removes all elements of ar1 from ar3
        ar3.removeAll(ar1);
        System.out.println("ar3.removeAll(ar1)     :"+ar3);

        ArrayList<Integer> ar4 = new ArrayList<Integer>(Arrays.asList(4,5,6,7,8));
        System.out.println("ArrayList four         :"+ar4);
//13.retainAll() ->prints all common elements between ar3 and ar4
        ar3.retainAll(ar4);
        System.out.println("Common ele bw ar3 & ar4:"+ar3);
//14.clone() -> returns arrayList which clones all elements of mentioned arrayList
        ArrayList <Integer> cloneList = (ArrayList <Integer>)ar4.clone();
        System.out.println("clone list of ar4      :"+cloneList);
    }
}

