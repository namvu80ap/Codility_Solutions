package com.nalaan.codilitylession.prefixSums;

/**
 * Created by nam.vu on 2016/07/29.
 * Count the number of passing cars on the road.
 */
public class PassingCars {
    public static int solution(int[] A) {

        int car = 0;
        int countPair = 0;

        for( int i =0 ; i < A.length; i++ ){
            if( A[i] == 0 ) car++;
            else countPair += car;
        }

        if ( Math.abs(countPair) > 1000000000 ) return -1;

        return countPair;
    }
}
