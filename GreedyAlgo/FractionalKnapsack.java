package DSA2.GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        double capacity = 50 ;

        double ratio[][] = new double[val.length][2];
        // col 1 = index , col 2 = ratio

        for(int i=0 ; i<val.length ; i++){
            ratio[i][0] = i ;
            ratio[i][1] = val[i]/ (double)weight[i] ;
        }
        //asceding order sorting
        Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1]));

        Double finalweight = 0.0 ;

        for(int i = ratio.length - 1 ; i >= 0 ; i--){
            int idx = (int)ratio[i][0];    //calculating udx is nessasary becuase after sorting original index is get change
            if(capacity >= weight[idx]){        //include full item
                finalweight = finalweight + val[idx];
                capacity = capacity - weight[idx];
            }else{
                finalweight = finalweight + (ratio[i][1] * capacity);
                capacity = 0;
                break;
            } 
        }
        System.out.println(finalweight);

    }
}
