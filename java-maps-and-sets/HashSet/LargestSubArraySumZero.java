import java.util.*;
public class LargestSubArraySumZero {
    static int MaxSubLen(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
    int maxLen = 0;
    int i=-1;
    int sum=0;
    int start=-1;
    int end =-1;
    map.put(sum,i);
    while(i<arr.length-1){
        i++;
        sum += arr[i];
        if(!map.containsKey(sum)){
            map.put(sum,i);
        }
        else{

            int len = i-map.get(sum);
            if(len>maxLen){
                maxLen=len;
            start = map.get(sum)+1;
            end =i;
                
            }
        }
    }
    System.out.println("start indx : "+start);
    System.out.println("end indx : "+end);
    return maxLen;
    }
    public static void main(String args[]){
   int arr[]={2,8,-3,-5,2,-4,6,1,2,1,-3,4}; 
int ml = MaxSubLen(arr);
   System.out.println("Max length : "+ml);

    }
}
