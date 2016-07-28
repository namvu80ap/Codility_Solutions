package com.nalaan.codilitylession.countingElements;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nam.vu on 2016/07/28.
 * Check whether array A is a permutation.
 */
public class PermCheck {
    public static int solution( int A[] ){
        Arrays.sort(A);
        for( int i = 0; i < A.length; i++ ){
            if( A[i] != i+1 ){
                return 0;
            }
        }
        return 1;
    }
}
