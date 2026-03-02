package DSA2.GreedyAlgo;

import java.util.ArrayList;

public class ActivitySelection {
    public static void main(String[] args) {
        
    int start[] = {1, 3, 0 , 5 , 8 , 0};
    int end[] = { 2 , 4 , 6, 7 , 9, 9};  //if end is sorted 

    int maxActivity=0;
    ArrayList<Integer> s = new ArrayList<>();

    maxActivity = 1;  //we increase count of to one beacuse we are performing first activity
    s.add(0);          // so we have add index  0 in our answer s 
    int endLast = end[0];  // end[] array is sorted so first activity is always short 

    for(int i = 1 ; i<end.length ; i++){  //firts activity already perform so we start from i =1 
        if(endLast<=start[i]){
            maxActivity++;
            s.add(i);
            endLast = end[i];
        }
    }
    System.out.println(maxActivity+ " ");
    for(int i=0 ; i<s.size() ; i++){
        System.out.print("A"+s.get(i)+" ");
    }

    }
}
