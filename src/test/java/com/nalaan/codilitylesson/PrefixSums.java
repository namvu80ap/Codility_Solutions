package com.nalaan.codilitylesson;

import com.nalaan.codilitylession.prefixSums.CountDiv;
import com.nalaan.codilitylession.prefixSums.GenomicRangeQuery;
import com.nalaan.codilitylession.prefixSums.MinAvgTwoSlice;
import com.nalaan.codilitylession.prefixSums.PassingCars;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by nam.vu on 2016/07/29.
 */
public class PrefixSums {
    @Test
    public void passingCars(){
        int[] data = new int[]{ 0,1,0,1,1 };
        Assert.assertEquals(5,PassingCars.solution(data));
        Assert.assertEquals(0,PassingCars.solution(new int[]{ 0,0,0,0,0 }));
        Assert.assertEquals(0,PassingCars.solution(new int[]{ 1,1,1,1,1, }));
    }

    @Test
    public void coundDiv(){
        Assert.assertEquals(3, CountDiv.solution(6, 11, 2));
        Assert.assertEquals(0, CountDiv.solution(1, 1, 2));
        Assert.assertEquals(1, CountDiv.solution(2, 2, 2));
    }

    @Test
    public void genomicRangeQuery(){
        int[] P = new int[]{2,5,0};
        int[] Q = new int[]{4,5,6};
        int[] result = new int[]{2,4,1};
        Assert.assertArrayEquals(result, GenomicRangeQuery.solution( "CAGCCTA" , P, Q ));
    }

    @Test
    public void minAvgTwoSlice(){
        int[] A = new int[]{4,2,2,5,1,5,8};
        int[] B = new int[]{1,2};
        Assert.assertEquals( 1, MinAvgTwoSlice.solution(A));
        Assert.assertEquals( 1, MinAvgTwoSlice.solution(B));
    }


}
