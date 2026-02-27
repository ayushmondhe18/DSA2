package DSA2.Stack;
import java.util.*;
public class NextGreater {
    
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0 , 1, 3};
        int arr2[]=new int[arr.length];
        Stack<Integer> s = new Stack<>();
        
        for(int i = arr.length -1 ; i>=0 ; i-- ){
            while(!s.empty() && arr[i]>= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                arr2[i]=-1;
            }else{
                arr2[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0 ; i<arr2.length ; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
