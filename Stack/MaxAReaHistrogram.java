package DSA2.Stack;

import java.util.Stack;

import DSA2.Stack.MyArrayList.stack;

public class MaxAReaHistrogram {
    public static void MaxArea(int arr[]){
        int maxArea= 0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];

        //calculating next  small right 
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1 ; i>=0 ; i--){
            while(!s.isEmpty() && arr[i]<= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=  arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //calculating next small left ==
        s = new Stack<>();
        for(int i=0 ; i<arr.length ; i++){
            while(!s.isEmpty() && arr[i]<= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]= -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //calculating area : width * height : (nsr[i] - nsl[i] -1 ) * arr[i]
        for(int i=0 ; i < arr.length ; i++){
            int width = nsr[i] - nsl[i] -1 ;
            int hieght = arr[i];
            int currArea = width * hieght ;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println(maxArea);

    }
    public static void main(String[] args) {
        int arr[]={2,4};
        MaxArea(arr);
    }
}
