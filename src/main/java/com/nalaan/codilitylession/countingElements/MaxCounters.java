package com.nalaan.codilitylession.countingElements;// you can also use imports, for example:
// import java.util.*;

/**
 * Calculate the values of counters after applying all alternating operations: increase counter by 1; set value of all counters to current maximum.
 * Ex: A {3,4,4,6,1,4,4} and N = 5  (  N {0,0,0,0,0})
 * When A[0] = 3 operator increase at 3 ==> N{0,0,1,0,0}
 * When A[1] = 4 operator increase at 4 ==> N{0,0,1,1,0}
 *
 */
public class MaxCounters {

    public static int[] solution(int N, int[] A) {

        int [] counters = new int[N];
        int current_max = 0;
        int overwrite = 0;

        for (int K = 0; K < A.length; K++) {
            if (A[K] > N) {
                overwrite = current_max;
            } else {
                if (counters[A[K] - 1] < overwrite) {
                    counters[A[K] - 1] = overwrite + 1;
                } else {
                    counters[A[K] - 1]++;
                }
                if (counters[A[K] - 1] > current_max) {
                    current_max = counters[A[K] - 1];
                }
            }

            for (int t : counters) {
                System.out.print(t);
            }
            System.out.println("");
        }


        for (int i = 0; i < N; i++) {
            if (counters[i] < overwrite) {
                counters[i] = overwrite;
            }
        }
        return counters;
    }

    public static int[] solution2(int N, int[] A) {
        int[] count = new int[N];
        int max = 0;
        int lastUpdate = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] <= N){
                if(count[A[i]-1] < lastUpdate){
                    count[A[i]-1] = lastUpdate+1;
                }
                else{
                    count[A[i]-1]++;
                }
                max = Math.max(max, count[A[i]-1]);
            }
            else{
                lastUpdate = max;
            }
        }
        for(int i = 0; i < N; i++){
            if(count[i] < lastUpdate)
                count[i] = lastUpdate;
        }
        return count;
    }

}