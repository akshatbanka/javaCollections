import java.util.*;
public class countSubArraySumK{

    public static int solution(int arr[],int target){
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(map.containsKey(sum-target)){
                count += map.get(sum-target);
            }
            map.put(sum,map.getOrDefault(sum,0) +1);
        }

        return count;
    }
    public static void main(String args[]){
int arr[] = {3,9,4,1,2,6,8,6,2,1};
int target=5;
int c=solution(arr, target);
System.out.println(c);
    }
}