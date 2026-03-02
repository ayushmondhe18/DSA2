package DSA2.GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelction2 {
    public static void main(String[] args) {
        
    int start[] = {1, 3, 0 , 5 , 8 , 0};
    int end[] = { 2 , 4 , 6, 7 , 9, 9};  
    //WHEN ENDING  ARRAY IS UNSORTED 

    //SORTING
    //1st col: index 2nd col: start.get() 3rd col:end.get()
    int activities[][] = new int[start.length][3];
    for(int i =0 ; i<start.length ; i++){
        activities[i][0] = i ;
        activities[i][1] = start[i];
        activities[i][2] = end[i];
    }
    //LAMDA FUNCTION USED TO SORT 2D ARRAY
    Arrays.sort(activities , Comparator.comparingDouble( o -> o[2]) );

    int maxActivity=0;
    ArrayList<Integer> s = new ArrayList<>();

    maxActivity = 1;  
    s.add(activities[0][0]);          
    int endLast = activities[0][2];   

    for(int i = 1 ; i<end.length ; i++){  
        if(endLast<=activities[i][1]){ 
            maxActivity++;
            s.add(activities[i][0]);
            endLast = activities[i][2];
        }
    }
    System.out.println(maxActivity+ " ");
    for(int i=0 ; i<s.size() ; i++){
        System.out.print("A"+s.get(i)+" ");
    }

    }
}
