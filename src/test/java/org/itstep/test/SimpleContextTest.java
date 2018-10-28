package org.itstep.test;

import org.itstep.SimpleContext;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SimpleContextTest {
    private List<Integer> list;
    private int sum, max;

    @Before
    public void initList() {
        list = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
        sum  = 55;
        max  = 10;
    }

    @Test
    public void sumTest() {
        assertEquals("Sum failed",sum,new SimpleContext(list).sum());
    }

    @Test
    public void maxTest() {
        assertEquals("Max failed",max,new SimpleContext(list).max());
    }
}
