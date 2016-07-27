package com.nalaan.codilitylession.iterations;// you can also use imports, for example:
// import java.util.*;

/*
The solution is use bitwise to shift 1 bit to right or left.
Compare with 0 or 1 with & operator, count up the 0, compare with the max count, or reset count to 0
 */

public class BinaryGap {

    public int solution(int N) {
        // write your code in Java SE 8
        int gap = 0;
        int max_gap = 0;
        long one = 1;
        long number = N;
        for (long i = 32; i >= 0; i--) {
            long mask = one << i;
            if (mask < number) {
                //System.out.println(mask & number);
                if ((number & mask) == 0) {
                    gap++;
                    //System.out.println(gap);
                } else {
                    if (gap > max_gap) {
                        max_gap = gap;
                    }
                    gap = 0;
                }
            }
        }
        return max_gap;
    }

    public static int getGap(int N) {
        int max = 0;
        int count = -1;
        int r = 0;

        while (N > 0) {
            // get right most bit & shift right
            r = N & 1;
            N = N >> 1;

            if (0 == r && count >= 0) {
                count++;
            }

            if (1 == r) {
                max = count > max ? count : max;
                count = 0;
            }
        }

        return max;
    }

    public static int getGap2(int N) {
        int pre = -1;
        int len = 0;

        while (N > 0) {
            int k = N & -N;

            int curr = (int) Math.log(k);

            N = N & (N - 1);

            if (pre != -1 && Math.abs(curr - pre) > len) {
                len = Math.abs(curr - pre) + 1;
            }
            pre = curr;
        }

        return len;
    }


}