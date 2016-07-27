package com.nalaan.codilitylession.timeComplexity;


/*
 * The solution is sum forward and backward in same loop, then get min value
 */
import java.util.Arrays;
import java.util.stream.IntStream;

public class TapeEquilibrium {
    public int solution(int[] A) {
        // write your code in Java SE 8
        long sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        long backward_sum = sum;
        long forward_sum = 0;
        long min_diff = Long.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            forward_sum += A[i];
            backward_sum -= A[i]; //Key line
            long abs_diff = Math.abs(forward_sum - backward_sum);
            if (abs_diff < min_diff) {
                min_diff = abs_diff;
            }
        }
        
        return (int)min_diff;
    }

}