import java.util.*;
public class MajorityElements {
    public static void main(String args[]){
        int arr[]= {2,3,3,5,3,8,8,3,8};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int i : map.keySet()){
           if(map.get(i)>=(arr.length/3)){
            System.out.println(i);
           }
        }

    }
}
