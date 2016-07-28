package com.nalaan.codilitylession.countingElements;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by nam.vu on 2016/07/27.
 * Find the earliest time when a frog can jump to the other side of a river.
 *
 */
public class FrogRiverOne {
    public static void main(String ... arg){
        System.out.println( solution( 3,new int[]{1,2,3,5}) );
    }

    public static int solution( int X, int A[] ){
        Map<Integer,Integer> mapStep = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if( !mapStep.containsKey(A[i]) ){
                mapStep.put(A[i], i);
            }
        }

        int checkEnoughStep = 0;
        int minTime = 0;
        for (int i = X  ; i >= 1 ; i--){
            if( mapStep.containsKey(i) ){
                checkEnoughStep++;
                if (minTime <= mapStep.get(i)) {
                    minTime = mapStep.get(i);

                }
            }
        }

        if( checkEnoughStep != X ){
            return -1;
        }

        return minTime;
    }

}
