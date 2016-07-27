package com.nalaan.codilitylession.company;

/**
 * Created by nam.vu on 2016/07/27.
 */
public class RakutenRectangle {

    public static void main( String ... arg ){
        System.out.println( solution(-4,1,2,6,2,-1,4,3) );
    }

    public static int solution(int K, int L, int M, int N, int P, int Q, int R,
                               int S) {

        int leftX = Math.max(K, P);
        int rightX = Math.min(M, R);
        int lowY = Math.max(L, Q);
        int highY = Math.min(N, S);

        int first = 0;
        int second = 0;

        try {
            first = ((M - K) * (N - L));
            second = ((R - P) * (S - Q));
        }catch (Exception e){
            return -1;
        }
        if( Integer.MAX_VALUE < first + second ){
            return -1;
        }

        if (leftX < rightX && lowY < highY) {

            int interSection = (rightX - leftX) * (highY - lowY);
            int unionArea = first + second - interSection;

            return unionArea;
        }

        return first + second ;

    }


}
