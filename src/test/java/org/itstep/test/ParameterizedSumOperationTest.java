package org.itstep.test;

import org.itstep.Operations;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedSumOperationTest {

    @Parameter
    public int x;

    @Parameter(1)
    public int y;

    @Parameter(2)
    public int expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0, 0 }, { 1, 1, 2 }, { 1, -1, 0 }, { -2, 2, 0 }, { 0, 1, 1 }, { -1, 0, -1 }, { 456, -127, 329 }
        });
    }

    @Test
    public void addTest() {
        assertEquals("addition failed",expected, Operations.add(x,y));
    }
}
