import java.util.*;
class iteratingArrayList {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

System.out.println("Using for loop");
for(int i=0;i<arr.size();i++){
System.out.print(arr.get(i)+" ");
}System.out.println();

System.out.println("Using for each loop");
for(int i : arr){
System.out.print(i+" ");
}System.out.println();

System.out.println("Using lamda and stream function");
arr.stream().forEach(ele->System.out.print(ele+" "));
System.out.println();

System.out.println("Using iterator");
Iterator<Integer>it = arr.iterator();
while(it.hasNext()){
System.out.print(it.next()+" ");
}System.out.println();

System.out.println("Using List iterator");

System.out.print("Forward iteration : ");
ListIterator litr = arr.listIterator();
while(litr.hasNext()){
System.out.print(litr.next()+" ");
}System.out.println();

System.out.print("Backward iteration : ");
while(litr.hasPrevious()){
System.out.print(litr.previous()+" ");
}System.out.println();

}
}

