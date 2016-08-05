package com.nalaan.codilitylession.prefixSums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nam.vu on 2016/08/04.
 * The key to solve this task is these two patterns:
 (1) There must be some slices, with length of two or three, having the minimal average value among all the slices.
 (2) And all the longer slices with minimal average are built up with these 2-element and/or 3-element small slices.
 *
 * Below is python code :
     def solution(A):
     min_avg_value = (A[0] + A[1])/2.0   # The mininal average
     min_avg_pos = 0     # The begin position of the first
     # slice with mininal average

     for index in xrange(0, len(A)-2):
     # Try the next 2-element slice
     if (A[index] + A[index+1]) / 2.0 < min_avg_value:
     min_avg_value = (A[index] + A[index+1]) / 2.0
     min_avg_pos = index
     # Try the next 3-element slice
     if (A[index] + A[index+1] + A[index+2]) / 3.0 < min_avg_value:
     min_avg_value = (A[index] + A[index+1] + A[index+2]) / 3.0
     min_avg_pos = index

     # Try the last 2-element slice
     if (A[-1]+A[-2])/2.0 < min_avg_value:
     min_avg_value = (A[-1]+A[-2])/2.0
     min_avg_pos = len(A)-2

     return min_avg_pos
 *
 */


public class MinAvgTwoSlice {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int sumUp = 0;
        double minAvg = Integer.MAX_VALUE;

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(0,0);
        for (int i = 0; i < A.length; i++) {
            sumUp += A[i];
            if( map.size() > 0 && i > 0 ){
                for (  Map.Entry<Integer,Integer> en : map.entrySet() ) {

                    double tmpMin = (sumUp - en.getValue())/( i - en.getKey() );
                    if( minAvg > tmpMin ){
                        minAvg = tmpMin;
                    }
                }
            }


            map.put(i,sumUp);
        }

        return (int)minAvg;
    }
}