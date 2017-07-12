package com.nalaan.codilitylession.company;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by namvu on 16/10/27.
 */
public class Nissan {
    public static void main( String ... args ){

    }


//
//    public static int solution(int A, int B) {
//        String strB = "" + B;
//        String strA = "" + A;
//        return strB.indexOf(A);
//    }
//    public static int solution(int[] A) {
//
//        Map<Integer,Integer> mapMaxRevr = new HashMap<Integer, Integer>();
//        int tmpMax = Integer.MIN_VALUE;
//        for (int i = A.length - 1 ; i > 0; i--) {
//            if(tmpMax < A[i]) {
//                tmpMax = A[i];
//            }
//            mapMaxRevr.put(i,tmpMax);
//        }
//
//        int maxFist = Integer.MIN_VALUE;
//        int maxAbs = Integer.MIN_VALUE;
//        for (int i = 0; i < A.length - 1; i++) {
//            if(maxFist < A[i]) {
//                maxFist = A[i];
//            }
//            int maxLast = mapMaxRevr.get(i+1);
//            if(maxAbs < Math.abs(( maxFist - mapMaxRevr.get(i+1) ))){
//                maxAbs = Math.abs(( maxFist - mapMaxRevr.get(i+1) ));
//            }
//
//        }
//        return maxAbs;
//    }
}
