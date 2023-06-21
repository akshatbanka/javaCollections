import java.util.*;
public class NextgreaterElement_stacks{

public static void main(String args[]){
  System.out.print("Given array : ");
int arr[] = {6,8,0,1,3};
  for(int i : arr){
    System.out.print(i+" ");
  }System.out.println();
Stack <Integer>  s= new Stack<>();
int nxtgr[] = new int[arr.length];

for(int i=arr.length-1;i>=0;i--){
while(!s.empty() && arr[s.peek()]<=arr[i]){
s.pop();
}
if(s.empty()){
nxtgr[i] = -1;
}
else{
  nxtgr[i]=arr[s.peek()];
}
s.push(i);
}
System.out.print("Next greater Element array : ");
for(int i : nxtgr){
  System.out.print(i+" ");
}System.out.println();
  }
}