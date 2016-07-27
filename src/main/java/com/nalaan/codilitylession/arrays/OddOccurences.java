package com.nalaan.codilitylession.arrays;// you can also use imports, for example:
// import java.util.*;

/**
 * The key of this solution is XOR
 * ^= bitwise exclusive OR and assignment operator.
 */

public class OddOccurences {

    public static void main( String ... arg ){
//        int a = 529 ;
//        a ^= 0;
//        System.out.println( Integer.toBinaryString( a ) );
//        System.out.println( a );
        solution( new int[]{3,3,9,9,3,3,4,2,2,5,5} );

    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.println( xor );
            System.out.println( A[i] );
            xor ^= A[i]; //key line
            System.out.println( xor );
            System.out.println( "------------------ ");
        }
        return xor;
    }



}