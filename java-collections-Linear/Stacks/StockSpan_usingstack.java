import java.util.*;
public class StockSpan_usingstack {

    public static void stock_span(int stock[],int span[]){
        Stack <Integer> s = new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<stock.length;i++){
            int curr = stock[i];
            while(!s.empty() && curr>= stock[s.peek()]){ 
                s.pop();
            }
            if(s.empty()){
                span[i]=i+1;
            }
            else{
                int prevhigh = s.peek();
                span[i]=i-prevhigh;
                s.push(i);
            }
        }
    }

public static void main(String args[]){
int stock[]={100,80,60,70,60,85,100};
int span[]= new int [stock.length];
//1 1 1 2 1 5 7
stock_span(stock,span);
for(int i : span){
    System.out.print(i+" ");
}System.out.println();
    }
}
