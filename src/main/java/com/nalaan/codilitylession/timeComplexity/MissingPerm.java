package com.nalaan.codilitylession.timeComplexity;
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//100 percent correctness score

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class MissingPerm {

    public static void main( String... arg ){
        System.out.println( solution2(new int[]{ } ));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int complete_sum = 0;
        int sum = 0;
        for (int i = 1; i <= A.length + 1; i ++) {
            complete_sum += i;
        }
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return complete_sum - sum;
    }

    public static int solution2(int[] A){
        Set<Integer> setElement = Arrays.stream(A).boxed().collect(Collectors.toSet());
        OptionalInt s = IntStream.range(1,A.length+1).filter( i -> !setElement.contains(i) ).findAny();
        return s.orElse(A.length+1);
    }

}