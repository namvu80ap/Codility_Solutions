package com.nalaan.codilitylession.prefixSums;

/**
 * Created by nam.vu on 2016/07/29.
 * Compute number of integers divisible by k in range [a..b].
 */
public class CountDiv {

    public static int solution(int A, int B, int K) {
        int i = (B / K) - (A / K) ;
        return ( A%K == 0 ) ? i+1 : i ;
    }

}
