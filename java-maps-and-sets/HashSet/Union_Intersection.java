import java.util.*;
public class Union_Intersection {
    public static void main(String args[]){
        int arr1[]={7,3,9};
    int arr2[]={6,3,9,2,9,4,3};
    HashSet<Integer> set = new HashSet<Integer>();
    //union
    for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
    }

    for(int i=0;i<arr2.length;i++){
        set.add(arr2[i]);
    }
    System.out.println("Union : "+set);

    set.clear();

    for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
    }
    System.out.print("Intersection : [");
    for(int i=0;i<arr2.length;i++){
        if(set.contains(arr2[i])){
            System.out.print(arr2[i]+" ");
            set.remove(arr2[i]);
        }
    }
    System.out.println("]");
}}
