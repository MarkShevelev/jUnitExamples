package org.itstep.test;

import org.itstep.Operations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationsTest {

    @Test
    public void addTest() {
        final int x = 3, y = 4;
        final int expectedValue = 7;
        assertEquals("addition failed",expectedValue, Operations.add(x,y));
    }

    @Test
    public void subTest() {
        final int x = 3, y = 4;
        final int expectedValue = -1;
        assertEquals("subtraction failed",expectedValue, Operations.sub(x,y));
    }

    @Test
    public void mulTest() {
        final int x = 3, y = 4;
        final int expectedValue = 12;
        assertEquals("multiplication failed",expectedValue, Operations.mul(x,y));
    }

    @Test
    public void divTest() {
        final int x = 3, y = 4;
        final int expectedValue = 0;
        assertEquals("division failed",expectedValue, Operations.div(x,y));
    }
}
