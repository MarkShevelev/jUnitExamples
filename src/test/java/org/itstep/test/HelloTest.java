package org.itstep.test;

import org.itstep.Hello;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {
    @Test
    public void helloTest() {
        assertEquals(new String("Hello Test!"),new Hello().hello());
    }
}
