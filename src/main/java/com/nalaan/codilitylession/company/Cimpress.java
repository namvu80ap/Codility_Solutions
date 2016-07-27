package com.nalaan.codilitylession.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nam.vu on 2016/07/27.
 */
public class Cimpress {

    public static void main( String ... arg ){
        System.out.println(solution(new int[]{1,3,-3})); //6
        System.out.println(solution(new int[]{4,3,2,5,1,1})); //4
    }

//    public static int solution(int[] A) {
//
//        int maxAbs = Integer.MIN_VALUE;
//
//        int maxFist = Integer.MIN_VALUE;
//        for (int i = 0; i < A.length - 1; i++) {
//            if(maxFist < A[i]) {
//                maxFist = A[i];
//            }
//
//            int maxLast = Integer.MIN_VALUE;
//            for(int j = i+1; j < A.length; j++){
//                if(maxLast < A[j]){
//                    maxLast = A[j];
//                }
//            }
//
//            if(maxAbs < Math.abs(( maxFist - maxLast ))){
//                maxAbs = Math.abs(( maxFist - maxLast ));
//            }
//
//        }
//
//        return maxAbs;
//    }

    public static int solution(int[] A) {

        Map<Integer,Integer> mapMaxRevr = new HashMap<Integer, Integer>();
        int tmpMax = Integer.MIN_VALUE;
        for (int i = A.length - 1 ; i > 0; i--) {
            if(tmpMax < A[i]) {
                tmpMax = A[i];
            }
            mapMaxRevr.put(i,tmpMax);
        }

        int maxFist = Integer.MIN_VALUE;
        int maxAbs = Integer.MIN_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            if(maxFist < A[i]) {
                maxFist = A[i];
            }
            int maxLast = mapMaxRevr.get(i+1);
            if(maxAbs < Math.abs(( maxFist - mapMaxRevr.get(i+1) ))){
                maxAbs = Math.abs(( maxFist - mapMaxRevr.get(i+1) ));
            }

        }
        return maxAbs;
    }

}
