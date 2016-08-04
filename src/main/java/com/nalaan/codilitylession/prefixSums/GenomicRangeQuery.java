package com.nalaan.codilitylession.prefixSums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by nam.vu on 2016/07/29.
 */
    public class GenomicRangeQuery {


    /**
     * 62% but I think we can find out better solution
     */
    public static int[] solution(String S, int[] P, int[] Q) {
        //To Int[]
        int[] intArr = new int[S.length()];
        for (int i = 0; i < S.length() ; i++) {
            switch (S.charAt(i)) {
                case 'A' : intArr[i] = 1;
                    break;
                case 'C' : intArr[i] = 2;
                    break;
                case 'G' : intArr[i] = 3;
                    break;
                case 'T' : intArr[i] = 4;
                    break;
            }

        }

        int[] result = new int[P.length] ;

        for (int i = 0; i < P.length ; i++) {
            int[] sub = Arrays.copyOfRange(intArr, P[i], Q[i] + 1);
            int t = Arrays.stream(sub).min().orElse(1) ;
            result[i] =t;
        }

        return result;
    }


    /*
    * https://rafal.io/posts/codility-genomic-range-query.html
    * 100%
    */
    public static int[] genome(String S, int[] P, int[] Q) {
        int len = S.length();
        int[][] arr = new int[len][4];
        int[] result = new int[P.length];

        for(int i = 0; i < len; i++){
            char c = S.charAt(i);
            if(c == 'A') arr[i][0] = 1;
            if(c == 'C') arr[i][1] = 1;
            if(c == 'G') arr[i][2] = 1;
            if(c == 'T') arr[i][3] = 1;
        }
        // compute prefixes
        for(int i = 1; i < len; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] += arr[i-1][j];
            }
        }

        for(int i = 0; i < P.length; i++){

            int x = P[i];
            int y = Q[i];

            for(int a = 0; a < 4; a++){

                int sub = 0;
                if(x-1 >= 0) sub = arr[x-1][a];

                if(arr[y][a] - sub > 0){
                    result[i] = a+1;
                    break;
                }

            }

        }
        return result;
    }
}
