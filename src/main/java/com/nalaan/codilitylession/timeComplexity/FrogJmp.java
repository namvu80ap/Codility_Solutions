package com.nalaan.codilitylession.timeComplexity;

/**
 * Created by nam.vu on 2016/07/28.
 */
public class FrogJmp {

    public int solution(int X, int Y, int D) {
        int result = Math.abs( ( Y - X )/D );
        return ( ( Y - X )%D == 0 )? result : result + 1 ;
    }

}
