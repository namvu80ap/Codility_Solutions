package com.nalaan.codilitylesson;

import com.nalaan.codilitylession.countingElements.MaxCounters;
import com.nalaan.codilitylession.countingElements.MissingInt;
import com.nalaan.codilitylession.countingElements.PermCheck;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nam.vu on 2016/07/28.
 */
public class CountingElementsTest {
    //@Test
    public void PermCheck(){
        Assert.assertEquals(1, PermCheck.solution(new int[]{1,2,3,4}) );
        Assert.assertEquals(0, PermCheck.solution(new int[]{1,2,4}) );
    }

    @Test
    public void MissingInteger(){
        Assert.assertEquals(5, MissingInt.solution2(new int[]{1,2,3,4,3,6}) );
        Assert.assertEquals(2, MissingInt.solution2(new int[]{3,4,5,1,1,1,6}) );
        Assert.assertEquals(2, MissingInt.solution2(new int[]{1,1,1}) );
        Assert.assertEquals(1, MissingInt.solution3(new int[]{2,0,3}) );
    }

    //@Test
    public void MaxCounter(){
        Assert.assertArrayEquals( new int[]{3,2,2,4,2} , MaxCounters.solution(5, new int[]{3,4,4,6,1,4,4} ));
    }
}
