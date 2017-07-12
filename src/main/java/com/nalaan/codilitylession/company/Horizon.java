package com.nalaan.codilitylession.company;

import java.util.StringTokenizer;

/**
 * Created by namvu on 17/07/12.
 */
public class Horizon {

    public void main(String... args){
        System.out.println( "OK" );
    }
    public static int solution(String str) {
        int maxCount = 0;
        StringTokenizer tokenizer = new StringTokenizer(str, ".?!");
        while(tokenizer.hasMoreTokens()){
            int countWord = tokenizer.nextToken().split("\\s").length;
            if(maxCount < countWord){
                maxCount = countWord;
            }
        }
        return maxCount;
    }

//    public static boolean solution(int[] A) {
//        // write your code in Java SE 8
//        //Should have an array
//        int maxInArr = 0;
//        int maxIndex = 0;
//
//        //
//        for (int i = 0; i < A.length; i++)
//        {
//            if (A[i] > maxInArr)
//            {
//                maxInArr = A[i];
//                maxIndex = i;
//            }
//        }
//
//        //Check the J to maxIndex
//        for (int j = 0; j < maxIndex ; j++)
//        {
//            if (A[j] > maxInArr)
//                return false;
//        }
//        //Check the J after maxIndex
//        for (int j = maxIndex + 1; j < A.length- 1; j++)
//        {
//            if (!(maxInArr > A[j] && A[j + 1] < A[j]))
//                return false;
//        }
//        return true;
//    }
//https://codility.com/c/feedback/48HNTH-DWW
}


//    SELECT Q.sensor_id, count( Q.event_type ) as event_type FROM (
//        SELECT events.sensor_id, events.event_type
//        FROM events
//        JOIN
//        (
//        SELECT sensor_id, event_type
//        FROM events
//        group by sensor_id, event_type
//        ) T
//        on events.sensor_id = events.sensor_id and
//        group by events.sensor_id, events.event_type, events.time
//        order by events.time
//        ) as Q GROUP BY Q.sensor_id
//
//
//
//
//        -- write your code in SQLite 3.8.6
//        SELECT Q.sensor_id, count(Q.event_type) as types FROM (
//        SELECT sensor_id, event_type
//        FROM events
//        group by sensor_id, event_type
//        ) as Q GROUP BY Q.sensor_id